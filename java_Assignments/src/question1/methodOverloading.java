package question1;

public class methodOverloading {

	public int add(int a , int b) {
		return(a+b);
	}
	
	public double add(double a , double b) {
		return(a+b);
	}
	
	public int diff(int a,int b) {
		return(a-b);
	}
	
	public int diff(int a,int b,int c) {
		return(a-b-c);
	}
	
	public static void main(String[] args) {
		methodOverloading obj = new methodOverloading();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(25.0, 35.0));
		System.out.println(obj.diff(45, 35));
		System.out.println(obj.diff(100, 75, 12));
	}
}
