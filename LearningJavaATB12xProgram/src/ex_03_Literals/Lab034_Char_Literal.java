package ex_03_Literals;

public class Lab034_Char_Literal {

	public static void main(String[] args) {
		
		char c1 = 'A';  // A to Z, a-z, !@#$%^&*()_+
		//char c = "A"; // "" == String = Bunch of Char
		
		char c2 = 'B';
		
		char c3 = '@';
		
		char c4 = '(';
		
		char c5 = '_';
		
		char c6 = '9';
		
		char c7 = '4';
		
		char c8 = ' '; //blank space
		
		
		// Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
		
        
        System.out.println("swetha kusupudi");
        System.out.println("swetha "+new_line+ "kusupudi");
        System.out.println("swetha\nkusupudi");
        System.out.println("swetha"+tab_line+"kusupudi");
        System.out.println("swetha"+back_space+"kusupudi");
        System.out.println("----------------------------");
        
        
        System.out.println("swetha"+carriage_return+"kusupudi");
        
        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        

        char my_laugh_smily = '\u1f60'; // :)

        
        char c11  = '\u1F60';


        
        System.out.println(c10);
        
        System.out.println(ruppes);
        
        System.out.println(my_laugh_smily);
        
        System.out.println(c11);
        
        
        
        
	}

}
