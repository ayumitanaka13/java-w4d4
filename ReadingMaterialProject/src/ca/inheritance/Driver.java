package ca.inheritance;

public class Driver {

	public static void main(String[] args) {
		TextBook b1 = new TextBook("Introduction to Java", 500, "Programming", 2);
		System.out.println(b1.getTitle());
	}
}
