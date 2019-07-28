package crazyjava;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

class CallTask extends RecursiveTask<Integer>{
	
	private static final int THRESHOLD = 20;
	private int arr[];
	private int start;
	private int end;
	
	public CallTask(int [] arr,int start,int end) {
		// TODO Auto-generated constructor stub]
		this.arr = arr;
		this.start = start;
		this.end =end;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		if (end-start<THRESHOLD){
			for (int i = start; i < end; i++) {
				sum += arr[i];
			}
			return sum;
		}else{
			
			int middle = (start+end)/2;
			CallTask left = new CallTask(arr, start, middle);
			CallTask right = new CallTask(arr, middle, end);
			left.fork();
			right.fork();
			return left.join()+right.join();
		}
	}
	
	
	
	
}




public class Sum {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		int[] arr = new int[100];
		Random random = new Random();
		int total = 0;
		for (int i = 0,len=arr.length; i <len; i++) {
			int tamp = random.nextInt(20);
			total += (arr[i] = tamp);
		}
		System.out.println(total);
		
		ForkJoinPool pool = ForkJoinPool.commonPool();
		Future<Integer>future = pool.submit(new CallTask(arr, 0, arr.length));
		System.out.println(future.get());
		pool.shutdown();

	}

}
