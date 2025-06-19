package If_Else;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2024;
		
		if((year%4==0 && year%100!=0) || year%400==0)
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}

}
