package collectionlearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("疯狂Java讲义",109);
		map.put("疯狂讲义",10);
		map.put("疯狂Ajax讲义",79);
		System.out.println(map);
		System.out.println("是否包含iOS讲义"+map.containsKey("疯狂iOS讲义"));
		for (String string : map.keySet()) {
			System.out.println(map.get(string));
		}
		for (Entry<String, Integer> obj : map.entrySet()) {
			System.out.println(obj.getKey()+"---->"+obj.getValue());
		}
		System.out.println(map.remove("iOS"));
		map.compute("疯狂iOS讲义",(k,v)->(v==null)?k.length():100);
		System.out.println(map);
	}
}
