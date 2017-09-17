package muhrtitading;

public class ThreadPriorityDemo {
	public static void main(String[]args) throws InterruptedException{
		
		MyCounterThread t1 = new MyCounterThread();
		t1.setName("T1");
		t1.setPriority(Thread.MIN_PRIORITY);
		
		MyCounterThread t2 = new MyCounterThread();
		t2.setName("T2");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		Thread.sleep(500);
		
		t1.stop1();
		t2.stop1();
		
		System.out.println("T1 counter value: "+t1.counter);
		System.out.println("T2 counter value: "+t2.counter);
		Runtime.getRuntime().exit(0);
		System.exit(0);
	}
}


class MyCounterThread extends Thread {
	public long counter = 0L;
	public boolean flag = true;
	
	
	public void run(){
		while(flag){
			counter++;
		}
	}
	
	public void stop1(){
		flag = false;
	}
	
}