import java.util.PriorityQueue;
public class PriorityQueueTest {
	
	public static void main(String[] args) {
		PriorityQueue<String> test1 = new PriorityQueue<String>();
		test1.offer("George");
		test1.offer("Jim");
		test1.offer("John");
		test1.offer("Blake");
		test1.offer("Michael");
		
		PriorityQueue<String> test2 = new PriorityQueue<String>();
		test2.offer("George");
		test2.offer("Katie");
		test2.offer("Kevin");
		test2.offer("Michelle");
		test2.offer("Ryan");
		System.out.println(test1);
		System.out.println(test2);
		
		PriorityQueue<String> test3 = new PriorityQueue<String>(test1);
		test3.addAll(test2);
		System.out.println("Union: "+test3);
		
		test3 = new PriorityQueue<String>(test1);
		test3.removeAll(test2);
		System.out.println("Difference12: "+test3);
		
		test3 = new PriorityQueue<String>(test2);
		test3.removeAll(test1);
		System.out.println("Difference21: "+test3);
		
		test3 = new PriorityQueue<String>(test1);
		test3.retainAll(test2);
		System.out.println("Intersection: "+test3);
	}
}
