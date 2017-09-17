package muhrtitading;

public class SynchronizationDemo2 {
	public static void main(String[]args){
		ReservationSystem r = new ReservationSystem();

		ReservationThread t1 = new ReservationThread(r, 1);
		ReservationThread t2 = new ReservationThread(r, 1);

		t1.setName("Vimal");
		t2.setName("Himanshu");

		t1.start();
		t2.start();
	}
}




class ReservationThread extends Thread {

	ReservationSystem r = null;

	int required = 0;

	ReservationThread(ReservationSystem r, int required){
		this.r = r;
		this.required = required;

	}
	@Override
	public void run() {
		synchronized (r) {
			r.reserve(required);			
		}
	}
}


class ReservationSystem {
	static int available = 1;

	public void reserve(int required){
		String name = Thread.currentThread().getName();
		System.out.println("Available seat for "+name+": "+available);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(available >= required){

			available = available - required;

			System.out.println(name+": successfully got seat");
		} else {
			System.out.println(name+": Reservation not successful");
		}			
	}

}
