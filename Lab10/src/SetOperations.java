import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperations {
	
	public static<E> void union(Set<E> a, Set<E> b) {
		Set<E> result = new LinkedHashSet<E>(a);
		for (E e : b) {
			result.add(e);
		}
		System.out.println(result);
	}
	
	public static<E> void intersection(Set<E> a, Set<E> b) {
		Set<E> result = new LinkedHashSet<E>();
		for (E e : a) {
			if (b.contains(e)) {
				result.add(e);
			}
		}
		System.out.println(result);
	}
	
	public static<E> void difference(Set<E> a, Set<E> b) {
		Set<E> result = new LinkedHashSet<E>(a);
		for (E e : b) {
			if (a.contains(e))
				result.remove(e);
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		String[] list1 = new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		LinkedHashSet<String> set1 = new LinkedHashSet<String>(Arrays.asList(list1));
		String[] list2 = new String[]{"George", "Katie", "Kevin", "Michelle", "Ryan"};
		LinkedHashSet<String> set2 = new LinkedHashSet<String>(Arrays.asList(list2));
		union(set1, set2);
		intersection(set1, set2);
		difference(set1, set2);
		difference(set2, set1);
	}
}
