package Exercise;

public class Bai01 {

	public static void main(String[] args) {	
		System.out.println(sort(5, 4, 6));
	}

	private static String sort(int a, int b, int c) {
		int medium = a + b + c - (Math.min(a, (Math.min(b, c))) + Math.max(a, (Math.max(b, c))));
		int max =  Math.max(a, (Math.max(b, c)));
		int min =  Math.min(a, (Math.min(b, c)));
		return "" + min+ "\n" + medium + "\n" +max;
	}

}
