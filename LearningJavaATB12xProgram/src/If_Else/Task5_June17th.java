package If_Else;
import java.util.Scanner;

public class Task5_June17th {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int age = sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
		sc.close();
		

	}

}
