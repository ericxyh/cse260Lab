import java.util.Comparator;

public class CompareY implements Comparator<Point> {

	public int compare(Point one, Point two) {
		if (one.getY() != two.getY()) {
			return one.getY() - two.getY();
		}
		return one.getX() - two.getX();
	}
	
}
