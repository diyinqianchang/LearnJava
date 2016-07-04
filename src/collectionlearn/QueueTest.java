package collectionlearn;

import java.util.PriorityQueue;

public class QueueTest {

	/*
	 * Queue用于模拟队列这种数据结构。新元素插入(offer)到队列的尾部，访问元素(poll)操作会返回队列头部的元素。
	 * 
	 * */
	public static void main(String[] args) {
		
		PriorityQueue<Object>qPriorityQueue = new PriorityQueue<>();
		qPriorityQueue.offer(6);
		qPriorityQueue.offer(-3);
		qPriorityQueue.offer(20);
		qPriorityQueue.offer(18);
		//访问队列的第一个元素并删除。
		System.out.println(qPriorityQueue.poll());
		System.out.println(qPriorityQueue);

	}

}
