package Exercise;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println(symmetry(111));
	}

	public static boolean symmetry(int a) {
		Integer number = new Integer(a);
		String numString = String.valueOf(number);
		char[] numArray = numString.toCharArray();
		String numRevese ="";
		for (int i = numArray.length - 1; i >= 0; i--) {
			numRevese = numRevese + numArray[i];
		}
		return (numRevese.equals(numString) ?  true :  false);
	}
}
