
public class ClassDemo {

	public static void main(String[] args) {
		A aobj = new A ();
		aobj.foo = 10;
		aobj.bobj.bar = 20;
		aobj.display();
		
		System.out.println(aobj.foo);
		
	}

}

class A {
	int foo;
	B bobj = new B ();
	void display (){
		System.out.println(foo);
		bobj.display();
	}
}

class B {
	int bar;
	void display(){
		System.out.println(bar);
	}
}