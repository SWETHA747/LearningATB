package If_Else;

import java.util.Scanner;

public class Task4_June17th {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
	    ch=Character.toLowerCase(ch);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("It is a vowel");
		}
		else
		{
			System.out.println("It is a consonant");
		}
		sc.close();

	}

}
