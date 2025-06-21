package LiveTest;

import java.util.Scanner;

public class Coding6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = sc.nextInt();
		
		if(number<0)
		{
			System.out.println("It is negetive number");
		}
		else if(number==0)
		{
			System.out.println("It is zero");
		}
		else
		{
			System.out.println("It is a positive number");
		}

	}

}
