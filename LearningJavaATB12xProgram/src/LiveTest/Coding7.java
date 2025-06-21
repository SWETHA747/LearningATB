package LiveTest;

import java.util.Scanner;

public class Coding7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first integer");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second integer");
		int num2 = sc.nextInt();
		
		System.out.println("Enter third integer");
		int num3 = sc.nextInt();
		
		if(num1>=num2 && num1>=num3)
		{
			System.out.println("Largest number is " + num1);
		}
		else if(num2>=num3)
		{
			System.out.println("Largest number is " + num2);
		}
		else
		{
			System.out.println("Largest number is " + num3);
		}
	}

}
