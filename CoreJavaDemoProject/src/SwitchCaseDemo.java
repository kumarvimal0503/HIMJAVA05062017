
/**
 * 
 * @author Vimal
 *
 */
public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		String city = "123123";
		double tax = 0.0;
		
		switch (city) {
		case "Mumbai": tax = 5;break;
		case "Pune": tax = 3;break;
		case "Solapur": tax = 2;break;
		default: tax = 10;
		case "Kolhapur": tax = 2;
		case "Nagpur": tax = 1;break;
		}
		
		System.out.println("Tax Applied for "+city+": "+tax );
	}

}
