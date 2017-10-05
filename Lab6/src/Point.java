import java.util.ArrayList;
import java.util.Collections;

public class Point implements Comparable<Point> {

	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int compareTo(Point other) {
		if (getX() != other.getX()) {
			return getX() - other.getX();
		}
		return getY() - other.getY();
	}
	
	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
	
	public static void main(String[] args) {
		ArrayList<Point> all = new ArrayList<Point>();
		for (int i = 0; i < 100; i++) {
			Point added = new Point((int)(Math.random() * 100), (int)(Math.random() * 100));
			all.add(added);
		}
		Collections.sort(all);
		for (Point point : all) {
			System.out.print(point + " ");
		}
		Collections.sort(all, new CompareY());
		System.out.println();
		for (Point point : all) {
			System.out.print(point + " ");
		}
	}
	
}
