package collectionlearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class COllectionTest {

	public static void main(String[] args) {

		Collection<Object> collection = new ArrayList<>();
		collection.add("�����");
		collection.add(6);
		System.out.println(collection.toArray()[1]);
		collection.remove(6);
		System.out.println(collection.size());
		
		collection.add("������Java EE��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ��"+collection);
		
		Collection<String> books = new HashSet<>();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java");
		System.out.println(books);
//		collection�����Ƿ���ȫ����books����
		System.out.println(collection.containsAll(books));
		//ȥ��collection�а���������books�����е�Ԫ��
//		collection.removeAll(books);
		System.out.println(collection);
		
		//���collection�����Ԫ��
//		collection.clear();
		//��ʱbooks����ֻʣ��collection����Ҳ����books��ͬ��Ԫ��  �󽻼�
//		books.retainAll(collection);
		System.out.println(books);
		
		//Lambda���ʽ ����
//		books.forEach((obj)->System.out.println(obj));
		
		//Iterator�ӿ�  ����  ������
		Iterator<String> iterator = books.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			/*if (string.equals("���Java")) {
				iterator.remove();
			}*/
		}
		iterator.forEachRemaining(obj->System.out.println(obj));
		
		for (String string : books) {
			System.out.println(string);
		}
	}

}
