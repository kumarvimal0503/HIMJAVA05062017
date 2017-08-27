package exception;

public class ExceptionDemo {
	public static void main(String[]args){
		
		int a = 10;
		int b = 0;
		int c = 0;
		Character x = null;
		try{
			c = a / b;
			
			c = x*10;
			System.out.println("Normal Excution");
			
	/*	} catch(ArithmeticException e) {
			System.out.println("Wrong input "+e);
		} catch(NullPointerException e) {
			System.out.println("Null Pointer "+e);
		} catch(Exception e){
			
		}*/
	
		} catch (ArithmeticException | NullPointerException e){
			System.out.println("Wrong input "+e);
		}
	
		System.out.println("C= "+c);
		
		
		
		
		
		
	}
}
