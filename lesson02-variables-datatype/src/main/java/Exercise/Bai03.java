package Exercise;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println(symmetry(12141));
	}

	private static boolean symmetry(int n) {
		int res = 0, temp = n;
		while (temp > 0) {
			res = res * 10 + temp % 10;
			temp /= 10;
		}
		if (res == n) {
			return true;
		} else {
			return false;
		}
	}
}
