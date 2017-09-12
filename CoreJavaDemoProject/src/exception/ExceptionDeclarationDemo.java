package exception;

public class ExceptionDeclarationDemo {
	public static void main(String[]args){
		try {
			devide(10, 0);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Rest of lines");
		
	}
	
	
	
	public static void devide(int a, int b) throws Exception{
		if( b > 0 ){
			int c = a / b;
			System.out.println("C= "+c);
		} else {
			throw new MyException("Please provide proper value");
		}
		
	}
}
