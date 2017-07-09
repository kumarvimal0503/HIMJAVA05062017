
public class FindArmstrongDemo {
	public static void main(String[]args){
		for(int inputNum = 1 ; inputNum <= 100000 ; inputNum++){
			int num = inputNum;
			int result = 0;

			int totalDigit = findDigit(inputNum);
			while(num > 0){
				int rem = num % 10;

				int remExponent = 1;
				for(int i = 1 ; i <= totalDigit ; i++){ 
					remExponent *= rem;
				}
				result += remExponent;

				num /= 10;
			}

			if(result == inputNum){
				System.out.println(inputNum+ " is Armstrong Number");
			}
		}

	}

	public static int findDigit(int inputNum){
		int count = 0;
		while(inputNum > 0){
			inputNum /= 10; 
			count++;
		}
		return count;



	}



}