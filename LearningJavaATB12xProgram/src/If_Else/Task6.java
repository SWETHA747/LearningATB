package If_Else;

public class Task6 {

	public static void main(String[] args) {
		
		int a = 130;
		int b = 120;
		int c = 178;
		
		if(a>=b && a>=c)
		{
			System.out.println(a + " is the largest number ");
		}
		else if(b>=c)
		{
			System.out.println(b + " is the largest number ");
		}
		else
		{
			System.out.println(c + " is the largest number ");
		}

	}

}
