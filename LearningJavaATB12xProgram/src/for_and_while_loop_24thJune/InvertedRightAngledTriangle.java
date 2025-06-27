package for_and_while_loop_24thJune;

import java.util.Scanner;

public class InvertedRightAngledTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++)
		{
			for(int j=number;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//OUTPUT
//Enter the number : 5
//*****
//****
//***
//**
//*
