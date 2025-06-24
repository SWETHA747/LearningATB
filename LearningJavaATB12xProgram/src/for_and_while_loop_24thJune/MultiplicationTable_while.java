package for_and_while_loop_24thJune;

import java.util.Scanner;

public class MultiplicationTable_while {
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		int i = 1;

		while (i <= 12) 
		{
			System.out.println(number + " * " + i + " = " + number * i);
			i++;
		}
		
		sc.close();

	}
}
