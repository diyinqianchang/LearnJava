package collectionlearn;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {
		
		Collection< String>books =  new HashSet<>();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���iOS����");
		books.add("���Ajax����");
		books.add("���Android����");
//		books.removeIf(ele->((String)ele).length()<10);
		
		
//		books.removeIf(new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				if (t.length()<10 && t.contains("iOS")) {
//					return false;
//				}else {
//					return true;
//				}
//			}
//			��ִ��
//			@Override
//			public Predicate<String> and(Predicate<? super String> other) {
//				System.out.println("--->"+other);
//				
//				Predicate<String>predicate = new Predicate<String>() {
//					@Override
//					public boolean test(String t) {
//						if (t.contains("iOS")) {
//							return false;
//						}
//						return true;
//					}
//				};
//				return Predicate.super.and(other);
//			}
//		});
		Stream<String> stream = books.stream().filter(ele->((String)ele).length()<10)
				.filter(ele->((String)ele).contains("iOS")).peek(e -> System.out.println(e));
		//peek��һ�۵���˼
		//.peek(e -> System.out.println("Filtered value: " + e))  ���ڲ���ǰ��������ȷ�� �ǲ�����Ҫ�Ľ��
		stream.map(ele->((String)ele))
		.forEach(System.out::println);

	}
}
