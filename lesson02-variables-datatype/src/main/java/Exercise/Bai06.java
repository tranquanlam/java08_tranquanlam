package Exercise;

public class Bai06 {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int num = 0;
		while (i != 200) {
			if (check(j)) {
				num = j;
				i++;
			}
			j++;
		}
		System.out.println(num);
	}

	public static boolean check(int a) {
		for (int i = 2; i < a / Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
