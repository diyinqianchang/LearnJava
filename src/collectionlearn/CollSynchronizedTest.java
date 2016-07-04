package collectionlearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollSynchronizedTest {

	public static void main(String[] args) {
		//获取一个线程安全的集合。
		Collection<String> c = Collections.synchronizedCollection(new ArrayList<>());
        System.out.println(c);
	}

}
