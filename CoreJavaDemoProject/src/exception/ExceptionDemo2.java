package exception;

public class ExceptionDemo2 {
	public static void main(String[]args){

		int a = 10;
		int b = 0;
		try{
			divide(a, b);
		} catch(Exception e){
			System.out.println("IN Main catch");
		}
		System.out.println("After catch block");

	}

	public static void divide(int a, int b){
		try{
			int c = a / b;
			System.out.println("C= "+c);
		} catch(Exception e){
			System.out.println("IN divide catch block");
			throw e;
		} finally {
			System.out.println("Cleaning task");
		}	
	}
}

