
public class ThisKeyDemo {
	public static void main(String[]args){
		Display d = new Display(10);
		d.printerDisplay();
	}
	

}


class Display{
	int num;
	public Display(int n){
		num = n;
	}
	public void printerDisplay(){
		Printer p = new Printer();
		Display d_1 = new Display(100);
		p.print(this);
		
	}
	public void fileDisplay(){
		
	}
}

class Printer {
	
	public void print(Display d){
		
		System.out.println("NUM======"+d.num);
	}
	
}
