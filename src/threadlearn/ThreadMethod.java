package threadlearn;
public class ThreadMethod extends Thread {
	public ThreadMethod(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("---->"+Thread.currentThread().getName()+i);
		}
	}
	public static void main(String[] args) {
		new ThreadMethod("线程").start();
		for (int i = 0; i < 20; i++) {
			if (i==5) {
				ThreadMethod threadMethod = new ThreadMethod("Join");
				threadMethod.start();
				try {
					threadMethod.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("---->"+Thread.currentThread().getName()+"=="+i);
		}
	}
}
