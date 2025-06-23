package If_Else_June20;

public class Task15 {

	public static void main(String[] args) {
		
		int number = 876788;
		int original = number;
		int reversed = 0;
		int temp;
		
		while(number!=0)
		{
			temp = number % 10;   // takes last digit
			reversed = reversed*10 + temp;
			number = number / 10; // removes last digit
		}
		if(original==reversed)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}
