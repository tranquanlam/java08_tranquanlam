package Exercise;

public class Bai02 {

	public static void main(String[] args) {
		System.out.println(factorial(4) * factorial(7) * factorial(17) * factorial(18));
	}

	private static long factorial(long a) {
		if (a > 1) {
			long result = 1;
			for (long i = 1; i <= a; i++) {
				result = result * i;
			}
			return result;
		} else {
			return 1;
		}
	}

}
