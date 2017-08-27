package inheritance;

public class InterfaceDemo {
	public static void main(String[]args){
		
		XImpl x = new XImpl();
		x.foo();
		x.bar();
		x.doSome();
		
		
		Y y = new XImpl();
		
		y.foo();
		y.bar();
		y.doSome();
		

	}
}

interface X {
	void foo();
	void bar();
}
interface Y extends X{
	void doSome();
}

 class XImpl implements X,Y {
	 
	 @Override
	 public void foo(){
		 System.out.println("IN foo()");
	 }
	 
	 @Override
	 public void bar(){
		 System.out.println("IN bar()");
	 }
	 
	 public void doSome(){
		 System.out.println("IN dp Spme()");
	 }
	 
 }
