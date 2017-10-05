import java.util.ArrayList;
public class SortArrayList {

	public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		ArrayList<E> dupe = new ArrayList<E>(list);
		E max = SortArrayList.max(dupe);
		while (dupe != null) {
			E temp = list.get(dupe.size() - 1);
			int maxAt = list.indexOf(max);
			list.set(maxAt, temp);
			dupe.set(maxAt, temp);
			list.set(dupe.size() - 1, max);
			dupe.remove(dupe.size() - 1);
		}
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for (E e : list) {
			if (e.compareTo(max) > 0) {
				max = e;
			}
		}
		return max;
	}
	
}
