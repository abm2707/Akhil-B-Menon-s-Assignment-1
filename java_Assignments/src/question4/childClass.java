package question4;

public class childClass extends parentClass {

	public void printchild() {
		System.out.println("This is child class");
	}
	public static void main(String[] args) {
		childClass c = new childClass();
		parentClass p = new parentClass();
		p.printparent(); // method of parent class by object of parent class
		c.printchild(); // method of child class by object of child class
		c.printparent(); // method of parent class by object of child class
	}
}
