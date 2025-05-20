package Tasks;

public class task3_May18 {

	public static void main(String[] args) {

		int i = 1, j = 2, k = 3;

		int m = i-- - j-- - k--;  // i-- = 0, j-- = 1, k-- =2   // 0 - 1 - 2  1-2-3=1-5=-4

		System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", m = " + m);
	}

}
