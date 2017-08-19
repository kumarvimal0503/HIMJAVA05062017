
public class MethodOverloadingDemo {
	
	public static void main(String[]args){
		Math m = new Math();
		m.add(13.0, 23);
		m.add(34, 23, 23);
		m.add(23, 23, 23, 23);
	}
	
}

class Math {
	public void add(int a, int b){
		System.out.println((a+b));
	}
	public void add(int a, int b, int c){
		System.out.println((a+b+c));
	}
	public void add(int a, int b, int c, int d){
		System.out.println((a+b+c+d));
	}
	public void add(double a, double b){
		System.out.println((a+b));
	}
}
