package crazyjava;

public class ThreadGroupTest {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("main name "+mainGroup.getName());
		new MyThread("主线程组的线程").start();
		
		ThreadGroup tGroup = new ThreadGroup("新线程组");
		tGroup.setDaemon(true);
		MyThread tMyThread = new MyThread(tGroup, "tg组的线程");
		tMyThread.start();
		new MyThread(tGroup,"tg组的线程2").start();
		
		System.out.println("hahahha");

	}

}


class MyThread extends Thread implements Thread.UncaughtExceptionHandler{
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public MyThread(ThreadGroup group,String name) {
		// TODO Auto-generated constructor stub
		super(group, name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <20; i++) {
			System.out.println(getName()+" 线程的i变量"+i);
		}
//		int a = 5/0;
	}
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("异常");
	}
}