package threadlearn;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FutureTask<Integer>task = new FutureTask<>(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
			   int sum = 0;
			   for (int i = 0; i < 100; i++) {
				 sum+=i;
			   }
				return sum;
			}
		});
		FutureTask<Integer>mTask = new FutureTask<>((Callable<Integer>)()->{
			int sum = 0;
			   for (int i = 0; i < 100; i++) {
				 sum+=i;
			   }
				return sum;
		});
		
		new Thread(task).start();
		try {
			System.out.println(task.get()+"<-----");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("haha");
	}

}
