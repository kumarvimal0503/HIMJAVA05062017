package muhrtitading;

public class ThreadDemoMain2 {
	public static void main(String[] args) {

		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		t1.setName("Vimal");
		t2.setName("Himanshu");
		
		t1.start();
		t2.start();
		
		t1.start();
	
		System.out.println("********************* Main Exited **********************");
	}
}


class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i = 1 ; i <= 50 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
		
		foo();
		bar();
	}
	
	
	public void foo(){
		System.out.println("IN Foo");
	}
	public void bar(){
		System.out.println("IN Bar");
	}
}

class MyThread2 extends Thread {
	
	@Override
	public void run() {
		for(int i = 1 ; i <= 1000 ; i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
	
}
