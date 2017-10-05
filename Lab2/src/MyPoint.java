
public class MyPoint {

	private double x;
	private double y;
	
	public MyPoint() {
		this(0,0);
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double distance(MyPoint other) {
		return distance(other.getX(), other.getY());
	}
	
	public double distance(double x1, double y1) {
		double xSquare= Math.pow(getX() - x1, 2);
		double ySquare= Math.pow(getY() - y1, 2);
		return Math.sqrt(xSquare + ySquare);
	}
	
}
