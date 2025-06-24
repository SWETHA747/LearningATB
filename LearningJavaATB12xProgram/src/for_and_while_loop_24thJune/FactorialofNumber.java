package for_and_while_loop_24thJune;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) 
	{
		int factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		for(int i =1; i<=number; i++)
		{
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of the " + number + " is : " + factorial);

	}

}
