package Exercise;

import java.util.Random;

public class Bai05 {

	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(100);
		int rem, i = 1, sum = 0;
		System.out.println("Chuyen so thap phan :" + number);
		do {
			rem = number % 2;
			sum = sum + (i * rem);
			number = number / 2;
			i = i * 10;
		} while (number > 0);
		System.out.println("Thanh so nhi phan :" + sum);
	}

}
