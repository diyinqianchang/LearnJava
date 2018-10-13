package collectionlearn;

import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		WeakHashMap<String, String>weakHashMap = new WeakHashMap<>();
		weakHashMap.put(new String("语文"), new String("良好"));
		weakHashMap.put(new String("数学"), new String("及格"));
		//系统缓存的字符串对象。
		weakHashMap.put("英文", "中等");
		System.out.println(weakHashMap);
		System.gc();
		System.runFinalization();
		System.out.println(weakHashMap);

	}

}
