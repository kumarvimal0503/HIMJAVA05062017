package muhrtitading;

public class SynchronizationDemo {
	public static void main(String[]args){
		Reservation r = new Reservation();
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.setName("Vimal");
		t2.setName("Himanshu");
		
		t1.start();
		t2.start();
	}
}




class Reservation implements Runnable {
	
	static int available = 1;
	int required = 1;
	
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Available seat for "+name+": "+available);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (this) {
			if(available >= required){
				
				available = available - required;
				
				System.out.println(name+": successfully got seat");
			} else {
				System.out.println(name+": Reservation not successful");
			}			
		}
	}
	
}
