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
		
		//��̬��������ȡ�����ڲ����Ļ����£�ʹ���ٶ��߳���Դ�������̰߳�ȫ��
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		int vall = rand.nextInt(4, 20);
		System.out.println(vall);
	}
}
