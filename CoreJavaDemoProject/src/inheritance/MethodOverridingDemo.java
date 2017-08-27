package inheritance;

public class MethodOverridingDemo {
	
	public static void main(String[]args){
		A a = new B();
		a.display();
	}
	
}



class A {
	
	public void display(){
		System.out.println("In A"); 
	}
	
} 

class B extends A {
	
	public void display(){
		System.out.println("In B");
	}
	
}