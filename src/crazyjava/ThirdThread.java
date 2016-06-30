package crazyjava;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
	public static void main(String[] args) {
//		ThirdThread rThirdThread = new ThirdThread();
		//先使用Lambda表达是创建Callable对象
		//使用FutureTask来包装Callable对象
//		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
//			int i = 0;
//			for (; i < 100; i++) {
//				System.out.println(Thread.currentThread()+" "+i);
//			}
//			return i;
//		});
		FutureTask<Integer>task = new FutureTask<Integer>(new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int i = 0;
				for (; i < 100; i++) {
					System.out.println(Thread.currentThread()+" "+i);
				}
				return i;
			}
		});
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if (i==20) {
				new Thread(task,"有返回值的线程").start();
			}
		}
		try {
			System.out.println("子线程的返回值:"+task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
