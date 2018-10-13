package collectionlearn;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {
		
		Collection< String>books =  new HashSet<>();
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂iOS讲义");
		books.add("疯狂Ajax讲义");
		books.add("疯狂Android讲义");
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
//			不执行
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
		//peek看一眼的意思
		//.peek(e -> System.out.println("Filtered value: " + e))  用于测试前面语句的正确性 是不是想要的结果
		stream.map(ele->((String)ele))
		.forEach(System.out::println);

	}
}
