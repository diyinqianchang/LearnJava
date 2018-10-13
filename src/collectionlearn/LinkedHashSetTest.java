package collectionlearn;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	/*
	 * LinkedHashSet类是HashSet的子类, 不过采用链表维护元素的次序。
	 * 这样看起来是以插入的顺序保存的。
	 * 同时不允许集合元素重复
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> books = new LinkedHashSet<>();
		books.add("疯狂Java讲义");
		books.add("轻量级Java EE企业应用实战");
		System.out.println(books);
		books.remove("疯狂Java讲义");
		books.add("疯狂Java讲义");
		books.add("疯狂Java讲义");
		System.out.println(books);
	}
}
