package collectionlearn;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> books = new LinkedList<>();
		
		books.offer("Java");
		books.push("iOS");
		books.offerFirst("Android");
		System.out.println(books);

	}

}
