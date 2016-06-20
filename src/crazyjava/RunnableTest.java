package crazyjava;


/*
 * Runnable对象仅仅作为Thread对象的target，Runnable实现类包含的run方法仅作为线程的执行体
 * 而实际的线程随想依然是Thread实例，只是该Thread线程负责执行其target的run方法
 * */
public class RunnableTest implements Runnable {
	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			System.out.println(Thread.currentThread().getName()+" "+ j);
			if (j == 2) {
				RunnableTest runnableTest = new RunnableTest();
				new Thread(runnableTest,"新线程1").start();   //线程对象
				new Thread(runnableTest,"新线程2").start();   //
			}
		}
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
