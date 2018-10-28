package collectionlearn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class ListTest {

	/*
	 * List集合代表一个元素有序、可重复的集合，集合中每个元素都要对应的顺序索引。
	 * */
	public static void main(String[] args) {
		List<String> books = new ArrayList<>();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		books.add(1,"疯狂Ajax讲义");
		System.out.println(books);
//	   ListIterator<String>listIterator = books.listIterator();
//	   while (listIterator.hasNext()) {
//		String book = (String) listIterator.next();
//		System.out.println(book);
//	   }
	   
	   //匿名这样的情况可以用Lambda的方式解决
	   books.sort(new Comparator<String>() {
		   public int compare(String o1,String o2) {
			   return o1.length()-o2.length();
		   };
	});
	   System.out.println(books);
	   books.replaceAll(ele->(ele+" iOS"));
	   System.out.println(books);
	   
	   ListIterator<String> lIterator = books.listIterator();
	   while (lIterator.hasNext()) {
		   
		   System.out.println(lIterator.next());
		   lIterator.add("--------------------");
	   }
	   
	   while (lIterator.hasPrevious()) {
		   System.out.println(lIterator.previous());
	   }
	   
	   
//	   LinkedList<String>books2 = new LinkedList<>();
//	   books2.offer("轻量级Java EE企业应用实战");
//	   books2.offer("疯狂Java讲义");
//	   books2.push("疯狂Ajax讲义");
//	   System.out.println(books2);
//	   System.out.println(books2.peekFirst());
//	   System.out.println(books2.peekLast());
//	   //将栈顶的元素弹出
//	   System.out.println(books2.pop());
	   
	}

}
