package muhrtitading;

public class FIrstThread {
	public static void main(String[]args) {
		
		
		Runnable j1 = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 1 ; i <= 1000 ; i++){
					System.out.println(Thread.currentThread().getName()+": "+i);
				}
				
			}
		};
		
		Runnable j2 = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 1 ; i <= 20 ; i++){
					
					System.out.println(Thread.currentThread().getName()+": "+i);
				}
				
			}
		};
		
		
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
			
		t1.start();
		t2.start();
		
		System.out.println("***************************Main Exited**************************");
		
	}
}
