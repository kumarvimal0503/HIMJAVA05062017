
/**
 * 
 * @author Vimal
 *
 */
public class OperatorDemo {

	public static void main(String[] args) {

		int salary = 100000;
		
		int expMonths = 4;
		
		
		System.out.println("Eligible?: "+(salary > 50000 && expMonths > 5));
		
		
		int num = 5; 
		
		System.out.println("Shift 2 bits Right: "+ (5 >> 2));
		
		System.out.println("Shift 2 bits Left: "+ (5 << 2));
		
		
		String msg = (salary > 50000) ? "You are eligible for Loan":" Not eliglible for loan";
		
		
		System.out.println("Message: "+msg);
		
		
		
		
		
		
		
		
		
		
	}

}
