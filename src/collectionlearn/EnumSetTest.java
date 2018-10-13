package collectionlearn;

import java.util.EnumSet;

enum Season{
	SPRING,SUMMER,FALL,WINTER
}

public class EnumSetTest {

	/*
	 * EnumSet在内部以为向量的形式存储，这种形式非常紧凑、高效，因此EnumSet占用内存很少
	 * 不允许加入null元素
	 * 通过类方法创建
	 * */
	public static void main(String[] args) {
	
		EnumSet<Season> esl = EnumSet.allOf(Season.class);
		System.out.println(esl);
		
		EnumSet<Season>esl2 = EnumSet.noneOf(Season.class);
		esl2.add(Season.FALL);
		System.out.println(esl2);
		
		EnumSet<Season>esl3 = EnumSet.of(Season.SPRING, Season.SUMMER);
		System.out.println(esl3);
		

	}

}
