package for_and_while_loop_24thJune;

import java.util.Scanner;

public class Pyramidpattern_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		int i=1;
		while(i<=number)
		{
			int j=i;
			while(j<number)
			{
				System.out.print(" ");
				j++;
			}
				int k=1;
				while(k<=(2*i-1))
				{
					System.out.print("*");
					k++;
				}
				System.out.println();
				i++;
			}
		}

	}


//OUTPUT
//Enter the number : 5
//  *
// ***
//*****
//*******
//*********

