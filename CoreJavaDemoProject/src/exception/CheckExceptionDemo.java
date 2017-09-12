package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionDemo {
	public static void main(String[]s){
		try{
		FileInputStream fin = 
				new FileInputStream("C:/Users/Vimal/Desktop/SMSData.xlsx");
			System.out.println("File read");
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		
		
	}
}
