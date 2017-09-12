package exception;

public class CustomExceptionDemo {
	public static void main(String[]args){
		
		String userName = "Vingh";
		
		try{
			String user = getUser(userName);
			System.out.println("User found: "+user);
		} catch(UserNotFoundException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	public static String getUser(String name) throws UserNotFoundException{
		
		if(name.equals("singh")){
			return "Singh";
		} else {
			throw new UserNotFoundException("User not found vid name: "+name);
		}
		
		
	}
}
