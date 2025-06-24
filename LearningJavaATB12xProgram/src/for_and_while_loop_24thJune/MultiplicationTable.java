package for_and_while_loop_24thJune;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		for(int i =1; i<=12; i++)
		{
			int number1 = number*i;
			
			System.out.println(number+ " * " + i +" = " + number1);
		}
		
		sc.close();
		
	}

}
