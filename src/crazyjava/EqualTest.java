package crazyjava;


/*
 * "=="和"equals"  
 * 当使用"=="来判断两个变量是否相等时，如果两个变量是基本类型变量，且都是数值类型
 * 则只要两个变量的值相等，就返回true
 * 对于两个引用类型变量，只要它们
 * */
public class EqualTest {

	public static void main(String[] args) {
		int it = 65;
		float f1 = 65.0f;
		char ch = 'A';
		System.out.println("65 和 65.0f是否相等"+ (it == f1));
		System.out.println("65和'A'是否相等"+(it == ch));
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println((str1.equals(str2)));
	}

}
