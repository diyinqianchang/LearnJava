package threadlearn;

public class ThreadLearn {

	private static class MyThread extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 100; i++) {
				System.out.println("---->"+Thread.currentThread().getName()+i);
			}
		}
	}
	
	private class RunLearn implements Runnable{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for (int i = 0; i < 100; i++) {
				System.out.println("---->"+Thread.currentThread().getName()+i);
			}
		}
	}
	
	
	public void test() {
//		MyThread thread = new MyThread();
//		thread.start();
		RunLearn runLearn = new  RunLearn();
		new Thread(runLearn,"线程1--").start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 new ThreadLearn().test();
		
	}

}
