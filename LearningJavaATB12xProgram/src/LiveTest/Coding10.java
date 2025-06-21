package LiveTest;

import java.util.Scanner;

public class Coding10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the second number : ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the operator (+, -, *, /) : ");
		char operator = sc.next().charAt(0);
		
		double result;

        // Perform calculation using switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operator. Please use only (+, -, *, or /) these operators");
        }


	}

}
