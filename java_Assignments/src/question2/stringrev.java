package question2;

public class stringrev {

	public static void main(String[] args) {
		String s = "I am Akhil";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}
