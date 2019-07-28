package threadlearn;
public class YeildLearn extends Thread {
	public YeildLearn(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("---->"+Thread.currentThread().getName()+"--"+i);
			if (i==5) {
				Thread.yield();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YeildLearn yLearn1 = new YeildLearn("优先级高");
		yLearn1.setPriority(Thread.MAX_PRIORITY);
		yLearn1.start();
		YeildLearn yLearn2 = new YeildLearn("优先级低");
		yLearn2.setPriority(Thread.MIN_PRIORITY);
		yLearn2.start();
	}
}
