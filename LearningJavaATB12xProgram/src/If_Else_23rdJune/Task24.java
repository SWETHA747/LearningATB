package If_Else_23rdJune;

import java.util.Scanner;

public class Task24 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL : ");
		String url = sc.nextLine();
		url = url.toLowerCase();

		if (url.endsWith(".com")) 
		{
			System.out.println("The website type is: Commercial website");
		} 
		else if (url.endsWith(".org")) 
		{
			System.out.println("The website type is: Non-profit organization");
		} 
		else if (url.endsWith(".edu")) 
		{
			System.out.println("The website type is: Educational institution");
		} 
		else if (url.endsWith(".gov")) 
		{
			System.out.println("The website type is: Government website");
		} 
		else if (url.endsWith(".net")) 
		{
			System.out.println("The website type is: Network-related website");
		} 
		else if (url.endsWith(".info")) 
		{
			System.out.println("The website type is: Informational website");
		}
		else 
		{
			System.out.println("The website type is: Unknown or other types of websites");
		}
		sc.close();

	}

}


//OUTPUT

//Enter the URL : Example.com
//The website type is: Commercial website

//Enter the URL : Udemy.edu
//The website type is: Educational institution

