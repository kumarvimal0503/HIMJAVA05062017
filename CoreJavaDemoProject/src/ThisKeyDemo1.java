
public class ThisKeyDemo1 {
	public static void main(String[]args){
		Display1 d = new Display1(10);
		d.printerDisplay();
	}
	

}


class Display1{
	int num;
	public Display1(int n){
		num = n;
	}
	public void printerDisplay(){
		Printer1 p = new Printer1();
		p.print(this.num);
		
	}
	public void fileDisplay(){
		
	}
}

class Printer1 {
	
	public void print(int num){
		
		System.out.println("NUM======"+ num);
	}
	
}
