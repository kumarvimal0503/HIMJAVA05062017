/**
 * 
 * @author Vimal
 *
 */
public class SwitchCharCaseDemo {
	
	public static void main(String[] args) {
		
		char choice = 77;
		
		String message = null;
		
		switch (choice) {
		case 'M': message = "I am male";break;
		case 'F': message = "I am female";break;
		default: message = "I am other";break;
		}
		
		System.out.println(message);
		
		
		
		
	}

}
