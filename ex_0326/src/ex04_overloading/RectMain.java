package ex04_overloading;

public class RectMain {
	public static void main(String[] args) {
		RectangleCalculator rc = new RectangleCalculator();
		System.out.println("넓이 : " + rc.area(5));
		System.out.println("넓이 : " + rc.area(5,10));
		System.out.println("넓이 : " + rc.area(5.0,3.0));
	}
}
