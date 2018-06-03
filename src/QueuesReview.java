import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuesReview {

	public static void main(String[] args) {

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		q1.add(10);
		q1.add(20);
		q1.add(30);

		System.out.println("Head of the queue is: " + q1.element());

		for (Integer value : q1) {
			System.out.println("Queue value: " + value);
		}

		System.out.println("Removed from queue " + q1.remove());
		System.out.println("Removed from queue " + q1.remove());
		System.out.println("Removed from queue " + q1.remove());

		///////////////////////////////////////////////////////////////////////////

		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		for (Integer value : q2) {
			System.out.println("Queue value: " + value);
		}
		
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());

	}

}
