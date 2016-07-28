package learningCollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueueExample.createQueue();
	}

	
	static void createQueue()
	{
		PriorityQueue<String> queue=new PriorityQueue<>();
		queue.add("this");
		queue.add("is");
		queue.add("Queues");
		queue.add("Interface");
		queue.add("Example");
		
		
		System.out.println(queue.peek());
		System.out.println("Printing the removed element:"+queue.poll());
		System.out.println("using offer function:"+queue.offer("hi"));
		//System.out.println("using elemnet function in queue:"+queue.element());
		//System.out.println("using add function:"+queue.add("Hello"));
		Iterator itr=queue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
