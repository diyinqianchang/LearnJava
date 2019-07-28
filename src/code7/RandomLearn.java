package code7;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random(50);
		System.out.println("read.nextBoolean(): "+random.nextBoolean());
		System.out.println("read.nextDouble(): "+random.nextDouble());
		
		ThreadLocalRandom tlR = ThreadLocalRandom.current();
		int vall = tlR.nextInt(4,20);

		System.out.println(vall);


	}

}
