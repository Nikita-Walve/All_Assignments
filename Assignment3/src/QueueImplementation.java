import java.util.Queue;
	import java.util.Comparator;
	import java.util.PriorityQueue;
	import java.util.Iterator;
public class QueueImplementation {
	public static void main(String args[])
	{
	Queue<Integer> queue=new PriorityQueue<>(Comparator.reverseOrder());
	//Queue<Integer> queue=new PriorityQueue<>();
	/*queue.add(10);
	queue.add(40);
	*/
	//the add is same as offer but we should prefer offer
	queue.offer(40);
	queue.offer(10);
	queue.offer(50);
	queue.offer(30);
	System.out.println("The queue elemnts are :");
	System.out.println(queue);
	System.out.println("The poped elemnet is :"+queue.poll());
	System.out.println("The queue elemnts are :");
	System.out.println(queue);
	System.out.println("The peek elemnet in the queue is :"+queue.peek());
	System.out.println("The head elemnet is :"+queue.element());
	System.out.println("The traversal of queue using iterator :");
	Iterator itr=queue.iterator();
	while(itr.hasNext())
	{
	System.out.print(itr.next()+" ");
	}
	System.out.println();
	boolean result=queue.isEmpty();
	System.out.println("The queue is empty :"+result);
	System.out.println("The size of queue is :"+queue.size());


	}
	}


