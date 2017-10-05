import java.util.LinkedList;
import java.util.ArrayList;
public class ListCompare {
	public static void main(String[] args) {
		LinkedList<Integer> linkSample = new LinkedList<Integer>();
		ArrayList<Integer> listSample = new ArrayList<Integer>();
		int[] arraySample = new int[5000];
		for (int i = 0; i < 5000; i++) {
			int rand = (int) (Math.random() * 10);
			linkSample.add(rand);
			listSample.add(rand);
			arraySample[i] = rand;
		}
	}
}
