package crazyjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest extends Thread{

	@Override
	public void run() {
	     for (int i = 0; i <10; i++) {
	    	 /*
	    	  * 当线程类继承Thread类时，直接使用this即可获取当前前程
	    	  * Thread对象的getName()返回当先线程的名字
	    	  * */
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			if (i==2) {
				new ThreadTest().start();
			}
		}
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss");
		Date date = new Date();
		System.out.println(simpleDateFormat.format(date));

	}

}
