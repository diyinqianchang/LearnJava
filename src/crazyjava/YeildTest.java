package crazyjava;

public class YeildTest extends Thread{
	
	public YeildTest(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			System.out.println(getName()+" "+i);
			if (i == 20) {
				Thread.yield();
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YeildTest yt1 = new YeildTest("高级");
		yt1.start();
		YeildTest yt2 = new YeildTest("低级");
		yt2.start();

	}

}
