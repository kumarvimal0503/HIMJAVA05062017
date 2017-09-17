
public class InnerClassDemo {
	public static void main(String[]args){
		
		X x = new XImpl();
		x.foo();
		
		X x1 = new X() {
				public void foo(){
					System.out.println("In Anonymous Foo");
				}
		};
		x1.foo();
		
		
				
		
		
		
		
		
		
	}
}


class Outer {
	
		static class Inner {
			
		}
}

interface X {
	public void foo();
}

class XImpl implements X {

	@Override
	public void foo() {
		System.out.println("In Implemented Foo");
	}
	
}