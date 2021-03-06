package collectionlearn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueTest {

	/*
	 * Queue用于模拟队列这种数据结构。新元素插入(offer)到队列的尾部，访问元素(poll)操作会返回队列头部的元素。
	 * PriorityQueue 不是按插入的顺序排列 而是按元素的大小排列的
	 * Deque 是一个双端接口
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
		System.out.println("===================");
		
		QueueTest.testDeque();

	}
	
	private  static void testDeque() {
		// TODO Auto-generated method stub
		
		ArrayDeque<String> stack = new ArrayDeque<>();
		
		//push压入栈
		stack.push("疯狂Java讲义");
		stack.push("轻量级Java EE企业应用实战");
		stack.push("疯狂Android");
		stack.addFirst("iOS");
		System.out.println(stack);
		
		System.out.println(stack.peek());

	}
	

}
