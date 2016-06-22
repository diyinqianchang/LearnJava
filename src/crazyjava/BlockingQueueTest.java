package crazyjava;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1);
		new Producer(blockingQueue).start();
//		new Producer(blockingQueue).start();
//		new Producer(blockingQueue).start();
		//启动了3个生产者向BlockingQueue集合放入元素，启动一个消费者线程从BlockingQueue集合取出元素。本程序的BlockingQueue集合容量为	
		//因此3个生产者无法连续放入元素，必须等待消费者线程取出一个元素后，3个生产者线程中的其中之一才能放入一个元素
		new Consumer(blockingQueue).start();
		
	}

}
class Producer extends Thread{
	private BlockingQueue<String> bq;
	public Producer(BlockingQueue<String> bq) {
		this.bq = bq;
	}
	@Override
	public void run() {
		String [] strArr = new String[]{
				"Java",
				"Struts",
				"Spring"
		};
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "生产中....");
			try {
				Thread.sleep(200);
				bq.put(strArr[i%3]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+"生产完成"+bq);
		}
		super.run();
	}
}
class Consumer extends Thread{
	private BlockingQueue<String>bq;
	public Consumer(BlockingQueue<String> bq) {
		this.bq = bq;
	}
	@Override
	public void run() {
		while (true) {
			System.out.println(getName()+"消费者准备消费");
			try {
				Thread.sleep(200);
				bq.take();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}



