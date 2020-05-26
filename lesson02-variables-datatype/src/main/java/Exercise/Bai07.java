package Exercise;

import java.util.Random;

public class Bai07 {

	public static void main(String[] args) {
		Random rd = new Random();

		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(10) + 20;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					continue;
				} else {
					while (a[i] == a[j]) {
						a[j] = rd.nextInt(10) + 20;
					}
				}
			}
		}
		int temp = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
