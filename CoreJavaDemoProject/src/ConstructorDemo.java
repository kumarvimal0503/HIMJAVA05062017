public class ConstructorDemo{  
	public static void main(String args[]){  
		A1 a=new A1(10);  
	}
}

class A1{  
	A1(){
		System.out.println("hello a");
	}
	
	A1(int x, int y){
		
		
	}
	
	
	
	A1(int x){
		this(12,10); 
		System.out.println(x);
	}  
}  
  