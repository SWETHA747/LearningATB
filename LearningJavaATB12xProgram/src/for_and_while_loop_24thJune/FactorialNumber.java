package for_and_while_loop_24thJune;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int i =1;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
	
		while(i<=number)
		{
			factorial = factorial*i;
			i++;
		}
		System.out.println("Factorial of the " + number + " is :" + factorial);

	}

}
