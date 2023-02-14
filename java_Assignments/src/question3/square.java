package question3;

public class square extends rectangle {
	
	public void printsquare() {
		System.out.println("Square is a rectangle");
	}
	public static void main(String[] args) {
		square s = new square();
		s.printrect();
		s.printshape();
	}
}
