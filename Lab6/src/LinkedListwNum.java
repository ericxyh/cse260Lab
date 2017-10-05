import java.util.Collections;
import java.util.LinkedList;
public class LinkedListwNum {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (String s: args) {
			list.add(Integer.parseInt(s));
		}
		LinkedList<Integer> temp = new LinkedList<Integer>(list);
		Collections.sort(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		Collections.shuffle(list);
		for (Integer num : list) {
			System.out.print(num + " ");
		}
		System.out.println();
		Collections.reverse(temp);
		for (Integer num : temp) {
			System.out.print(num + " ");
		}
	};
}
