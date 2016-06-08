package crazyjava;


class BaseClass{
	public int book = 6;
	public void base() {
		System.out.println("父类的普通方法");
	}
	public void test() {
		System.out.println("父类的被覆盖方法");
	}
}


public class SubClass extends BaseClass{

	public  String book = "轻量级Java EE";
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("子类覆盖父类的方法");
	}
	public void sub() {
		System.out.println("子类的普通方法");
	}
	
	public static void main(String[] args) {
//		BaseClass baseClass = new BaseClass();
//		System.out.println(baseClass.book);
//		baseClass.base();
//		baseClass.test();
//		
//		SubClass subClass = new SubClass();
//		System.out.println(subClass.book);
//		subClass.sub();
//		subClass.test();
		
		BaseClass plo = new SubClass();
		System.out.println(plo.book);
		System.out.println(plo instanceof BaseClass);
		plo.base();
		plo.test();
	}

}
