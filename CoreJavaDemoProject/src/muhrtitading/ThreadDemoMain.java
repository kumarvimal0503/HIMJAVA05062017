package muhrtitading;

public class ThreadDemoMain {
	public static void main(String[] args) {

		MyThreadOne j1 = new MyThreadOne();
		MyThreadTwo j2 = new MyThreadTwo();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		
		t1.setName("Vimal");
		t2.setName("Himanshu");
		
		t1.start();
		t2.start();
	
		System.out.println("********************* Main Exited **********************");
	}
}


class MyThreadOne implements Runnable {
	@Override
	public void run() {
		for(int i = 1 ; i <= 50 ; i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}

class MyThreadTwo implements Runnable {
	
	@Override
	public void run() {
		for(int i = 1 ; i <= 1000 ; i++){
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
	
}
