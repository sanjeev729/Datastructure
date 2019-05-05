package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TryPQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return -o1.compareTo(o2);
			}

		});

		pq.add(1);
		pq.add(2);
		pq.add(5);
		pq.add(4);
		pq.add(3);
		pq.add(2);

		System.out.println(pq);
		pq.remove();
		// System.out.println(pq);
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		// System.out.println(pq);
		pq.remove();
		System.out.println(pq);
	}

}
