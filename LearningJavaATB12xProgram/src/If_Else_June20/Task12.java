package If_Else_June20;

public class Task12 {

	public static void main(String[] args) {

		int number = 18;
		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		}

		else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;

				}
			}
		}

		if ((isPrime)) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}

}
