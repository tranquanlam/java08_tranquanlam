package Exercise;

public class Bai01 {

	public static void main(String[] args) {	
		System.out.println(sortThreeNumber(5, 4, 6));
	}

	public static String sortThreeNumber(int a, int b, int c) {
		int medium = a + b + c - (Math.min(a, (Math.min(b, c))) + Math.max(a, (Math.max(b, c))));
		return "" + Math.min(a, (Math.min(b, c))) + "\n" + medium + "\n" + Math.max(a, (Math.max(b, c)));
	}

}
