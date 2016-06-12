package crazyjava;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		System.out.println(random.nextBoolean());
		byte[] buffer = new byte[16];
		random.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		System.out.println(random.nextFloat());
		
		//静态方法来获取对象。在并发的环境下，使减少多线程资源竞争。线程安全的
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		int vall = rand.nextInt(4, 20);
		System.out.println(vall);
	}
}
