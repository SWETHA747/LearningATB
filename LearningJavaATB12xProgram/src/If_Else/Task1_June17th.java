package If_Else;

import java.util.Scanner;

public class Task1_June17th {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input: ");
		int num = scanner.nextInt();
		
		if(num>=0)
		{
			System.out.println("It is a positive number");
		}
		else
		{
			System.out.println("It is a negetive number");
		}
		scanner.close();
				
	}

}
