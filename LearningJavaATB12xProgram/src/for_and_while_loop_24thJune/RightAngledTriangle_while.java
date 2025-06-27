package for_and_while_loop_24thJune;

import java.util.Scanner;

public class RightAngledTriangle_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		int i =1;
		while(i<=number)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}


//OUTPUT
//Enter the number : 5
//*
//**
//***
//****
//*****