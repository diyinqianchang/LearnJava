package crazyjava;

/*
 * 字符串就是一连串的字符序列，java提供够了String和StringBuffer两个封装字符串，并提供
 * 了一系列方法来操作字符串对象。
 * String类是不可变类。即一旦一个String对象被创建以后，包含在这个对象中的字符序列是不可改变的
 * StringBuffer对象则代表一个字符串序列可变的字符串，当一个StringBuffer被创建以后
 * 通过StringBuffer提供的append()、insert()、setChartAt()等方法可以改变这个字符串
 * 
 * */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch ={'I',' ','l','o','v','e',' ','y','o','u'};
		String string = new String(ch);
		System.out.println(string);
		System.out.println(string.charAt(5));
		System.out.println(string.lastIndexOf('o'));
		//替换
		System.out.println(string.replace('o', 'i'));
		System.out.println(string.toUpperCase());
		
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("java");
		System.out.println(sBuffer);
		System.out.println(sBuffer.insert(0, "hello  "));
		System.out.println(sBuffer.replace(5, 6, ","));
		System.out.println(sBuffer.reverse());
		System.out.println(sBuffer.length());
		System.out.println(sBuffer.capacity());
	}

}
