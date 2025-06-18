package If_Else;

import java.util.Scanner;

public class Task2_June17th {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();

		if (number % 2 == 0) 
		{
			System.out.println(number + " It is a Even number ");
		} 
		else 
		{
			System.out.println(number + " It is a Odd number ");
		}
		scanner.close();

	}

}
