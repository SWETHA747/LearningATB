package for_and_while_loop_24thJune;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();

		boolean isprime = true;

		for (int i = 2; i <= number/2; i++)
		{
			if (number % i == 0) {
				isprime = false;
				break;
			}

		}

		if (isprime)
		{
			System.out.println("It is a prime number");
		} 
		else 
		{
			System.out.println("It is not a prime number");
		}
	}

}
