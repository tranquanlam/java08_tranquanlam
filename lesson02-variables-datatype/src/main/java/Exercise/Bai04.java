package Exercise;

import java.util.Random;

public class Bai04 {

	public static void main(String[] args) {
		int[] listNumber = new int[9];
		Random rd = new Random();
		for (int i = 0; i < 9; i++) {
			listNumber[i] = rd.nextInt(50);
		}
		for (int i = 0; i < listNumber.length; i++) {
			System.out.print(listNumber[i] + " ");
		}
		System.out.println("-->" + oddNumberSecond(listNumber));
		

	}

	public static int oddNumberSecond(int[] a) {
		int lenghtArrayOther = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				lenghtArrayOther++;
			}
		}

		int[] arrayOther = new int[lenghtArrayOther];
		int i = 0;
		while (i < arrayOther.length) {
			for (int j = 0; j < a.length; j++) {
				if (a[j] % 2 != 0) {
					arrayOther[i] = a[j];
					i++;
				}
			}
		}

		int tamp = 0;
		for (int j = 0; j < arrayOther.length - 1; j++) {
			for (int j2 = 0; j2 < arrayOther.length - 1 - j; j2++) {
				if (arrayOther[j2] < arrayOther[j2 + 1]) {
					tamp = arrayOther[j2];
					arrayOther[j2] = arrayOther[j2 + 1];
					arrayOther[j2 + 1] = tamp;
				}
			}
		}
		return arrayOther[1];
	}

}
