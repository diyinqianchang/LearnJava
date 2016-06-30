package crazyjava;

public class PrimitiveTransferTest {

	/*
	 * 方法重载 方法名相同，形参不同
	 * 
	 * */
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("swap方法里，a值是："+a+" b值是"+b);
	}
	
	public static void swap(DataWrap dw) {
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap方法里，a成员变量的值是:"+dw.a + " b:"+dw.b);
		dw = null;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6;
		int b = 9;
		swap(a, b);
		System.out.println("a："+a+" b:"+b);
		
		DataWrap dataWrap = new DataWrap();
		dataWrap.a = 6;
		dataWrap.b = 9;
		swap(dataWrap);
		System.out.println("dataWrap.a："+dataWrap.a+" dataWrap.b:"+dataWrap.b);
		
		test(5, "疯狂Java讲义","轻量级Java EE");
		//这种调用方式也可以
		test(4, new String[]{"疯狂Java讲义","轻量级Java EE"});
	}
	
	/*
	 * 形参个数可变的方法
	 * */
	public static void test(int a, String...books) {
		for (String tmp : books) {
			System.out.println(tmp);
		}
		System.out.println(a);
	}
   

}
class DataWrap{
	int a;
	int b;
}