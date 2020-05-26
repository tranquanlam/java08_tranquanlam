package Exercise;

import java.util.Random;

public class Bai04 {

	public static void main(String[] args) {
		int[] numbers = new int[9];
		Random rd = new Random();
		for (int i = 0; i < 9; i++) {
			numbers[i] = rd.nextInt(50);
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		if (findSecondOddMaxNumbero(numbers) == 0) {
			System.out.println("-->" + "nothing");
		} else {
			System.out.println("-->" + findSecondOddMaxNumbero(numbers));
		}
	}

	private static int findSecondOddMaxNumbero(int[] numbers) {
		int firstMax, secondMax;

		if (numbers[0] > numbers[1]) {
			firstMax = numbers[0];
			secondMax = numbers[1];
		} else {
			firstMax = numbers[1];
			secondMax = numbers[0];
		}

		int tam;
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			if (number % 2 != 0) {
				if (firstMax % 2 == 0 && secondMax % 2 == 0) {
					firstMax = number;
				}
				if (firstMax % 2 != 0 || secondMax % 2 != 0) {
					if (secondMax % 2 != 0 && firstMax % 2 == 0) {
						tam = firstMax;
						firstMax = secondMax;
						secondMax = tam;
					}
					if (secondMax % 2 != 0 && firstMax % 2 != 0) {
						if (secondMax > firstMax) {
							tam = firstMax;
							firstMax = secondMax;
							secondMax = tam;
						}
					}
					if (firstMax % 2 != 0 && secondMax % 2 == 2) {
						secondMax = number;
					}
				}
			}

			if (number % 2 != 0 && number > secondMax && number != firstMax) {
				if (number > firstMax) {
					secondMax = firstMax;
					firstMax = number;
				} else {
					secondMax = number;
				}
			}
		}
		
		// case notthing secondMax or just one odd in array
		if (firstMax % 2 == 0 && secondMax % 2 == 0) {
			return 0;
		} else {
			if (firstMax % 2 != 0) {
				if (secondMax % 2 != 0) {
					return secondMax;
				} else {
					return 0;
				}
			} else {
				return secondMax;
			}
		}
	}
}
