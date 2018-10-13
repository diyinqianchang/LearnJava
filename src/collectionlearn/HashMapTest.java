package collectionlearn;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String>hMap = new HashMap<>();
		hMap.put(null, null);
		hMap.put("a", null);
		System.out.println(hMap);
	}

}
