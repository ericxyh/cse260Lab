
public class Complex {

	private double real, imaginary;
	
	public Complex() {
		this(0,0);
	}
	
	public Complex(double a) {
		this(a,0);
	}
	
	public Complex(double a, double b) {
		real = a;
		imaginary = b;
	}
	
	public double getRealPart() {
		return real;
	}
	
	public double getImaginaryPart() {
		return imaginary;
	}
	
	public String toString() {
		String output = "(";
		output += getRealPart();
		if (getImaginaryPart() != 0) {
			if (getImaginaryPart() > 0) {
				output += "+";
			}
			output += getImaginaryPart();
			output += "i";
		}
		output += ")";
		return output;
	}
	
	public Complex add(Complex other) {
		double a = getRealPart() + other.getRealPart();
		double b = getImaginaryPart() + other.getImaginaryPart();
		return new Complex(a,b);
	}
	
	public Complex subtract(Complex other){
		double a = getRealPart() - other.getRealPart();
		double b = getImaginaryPart() - other.getImaginaryPart();
		return new Complex(a,b);
	}
	
	public Complex multiply(Complex other){
		double a = getRealPart() * other.getRealPart() - getImaginaryPart() * other.getImaginaryPart();
		double b = getImaginaryPart() * other.getRealPart() + other.getImaginaryPart() * getRealPart();
		return new Complex(a,b);
	}
	
	public Complex divide(Complex other){
		double c2d2 = Math.pow(other.getRealPart(), 2) + Math.pow(other.getImaginaryPart(), 2);
		double a = (getRealPart() * other.getRealPart() + getImaginaryPart() * other.getImaginaryPart()) / c2d2;
		double b = (getImaginaryPart() * other.getRealPart() - other.getImaginaryPart() * getRealPart()) / c2d2;
		return new Complex(a,b);
	}
	
}
