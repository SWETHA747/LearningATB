package ex_04_Operators;

public class Lab040_Relational_Operators {

	public static void main(String[] args) {
		
		 // < Less Than
         // < =  -> Less than or equal to
         // > Greater
         // > = Greater or equal
         // == ->  Equal to (but checking)
         // != -> Not equal

        // All of them will result boolean output.

        int a = 20;
        int b = 50;
        boolean c = a > b; // // 20 > 50
        System.out.println(c);

        int age_swetha = 25;
        int age_sujatha = 45;

        boolean result = age_sujatha >= age_swetha;
        
        System.out.println(result);

       //  age_sujatha > age_swetha or age_sujatha = age_swetha
	}

}
