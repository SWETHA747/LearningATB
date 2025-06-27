package for_and_while_loop_24thJune;

import java.util.Scanner;

public class InvertedPyramidPattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		
		for(int i= number; i>=1;i--)
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.print(" ");
			}
			for(int k =1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//OUTPUT
//Enter the number : 5
//*********
// *******
//  *****
//   ***
//    *


//Enter the number : 9
//*****************
// ***************
//  *************
//   ***********
//    *********
//     *******
//      *****
//       ***
//        *
