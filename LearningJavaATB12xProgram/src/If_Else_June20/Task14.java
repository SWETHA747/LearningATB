package If_Else_June20;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
	
//		int a =10;
//		int b = 12;
//		int c = 18;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st side : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd side : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the 3rd side : ");
		int c = sc.nextInt();
		
		if(a+b>c && a+c>b && b+c>a)
		{
			System.out.println("It is valid triangle");
		}
		else
		{
			System.out.println("It is not a valid triangle");
		}

	}

}
