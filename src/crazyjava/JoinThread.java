package crazyjava;

public class JoinThread extends Thread {
	
	public JoinThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName()+ " " + i);
		}
	}
	public static void main(String[] args) {
		new JoinThread("新线程").start();
		for (int i = 0; i <100; i++) {
			if (i==20) {
				JoinThread jThread = new JoinThread("被Join的线程");
				jThread.start();
				try {
					jThread.join();    //必须等到执行的线程被完成之后  主线程才工作，在此期间主线程暂停。
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
