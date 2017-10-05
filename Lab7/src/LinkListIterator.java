import java.util.LinkedList;
import java.util.Iterator;
public class LinkListIterator {

	public static void main(String[] args) {
		LinkedList<Integer> sample = new LinkedList<Integer>();
		for (int i = 0; i < 5000; i++) {
			int rand = (int) (Math.random() * 10);
			sample.add(rand);
		}
		Iterator<Integer> iter = sample.iterator();
		long startTime = System.currentTimeMillis();
		while (iter.hasNext()) {
			iter.next();
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(executionTime);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < sample.size(); i++) {
			sample.get(i);
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(executionTime);
	}
	
}
