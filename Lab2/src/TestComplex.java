import java.util.Scanner;

public class TestComplex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		Complex a = new Complex(x1, x2);
		Complex b = new Complex(y1, y2);
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));
	}
}
