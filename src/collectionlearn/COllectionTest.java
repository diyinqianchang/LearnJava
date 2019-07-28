package collectionlearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class COllectionTest {

	public static void main(String[] args) {

		Collection<Object> collection = new ArrayList<>();
		collection.add("孙悟空");
		collection.add(6);
		System.out.println(collection.toArray()[1]);
		collection.remove(6);
		System.out.println(collection.size());
		
		collection.add("轻量级Java EE企业应用实战");
		System.out.println("c集合的元素"+collection);
		
		Collection<String> books = new HashSet<>();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java");
		System.out.println(books);
//		collection集合是否完全包含books集合
		System.out.println(collection.containsAll(books));
		//去除collection中包含的所有books里面有的元素
//		collection.removeAll(books);
		System.out.println(collection);
		
		//清楚collection里面的元素
//		collection.clear();
		//此时books里面只剩下collection里面也有与books相同的元素  求交集
//		books.retainAll(collection);
		System.out.println(books);
		
		//Lambda表达式 遍历
//		books.forEach((obj)->System.out.println(obj));
		
		//Iterator接口  遍历  迭代器
		Iterator<String> iterator = books.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			/*if (string.equals("疯狂Java")) {
				iterator.remove();
			}*/
		}
		iterator.forEachRemaining(obj->System.out.println(obj));
		
		for (String string : books) {
			System.out.println(string);
		}
	}

}
