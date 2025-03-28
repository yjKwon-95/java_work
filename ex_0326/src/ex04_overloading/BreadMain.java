package ex04_overloading;

public class BreadMain {
	public static void main(String[] args) {
		Bread b = new Bread();
		b.makeBread();
		b.makeBread(5);
		b.makeBread("소보로", 3);
	}
}
