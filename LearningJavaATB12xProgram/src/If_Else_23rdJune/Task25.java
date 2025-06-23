package If_Else_23rdJune;

import java.util.Scanner;

public class Task25 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age :");
		int age = sc.nextInt();

		if (age <= 12) 
		{
			System.out.println("Child");
		} 
		else if (age <= 19) 
		{
			System.out.println("Teenager");
		} 
		else if (age <= 64)
		{
			System.out.println("Adult");
		} 
		else {
			System.out.println("Senior Citizen");
		}
		
		sc.close();
	}

}


//OUTPUT:
//Enter the age : 30
//Adult

//Enter the age : 68
//Senior Citizen
