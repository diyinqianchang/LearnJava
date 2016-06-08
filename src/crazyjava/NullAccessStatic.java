package crazyjava;

public class NullAccessStatic {

	
	private static void test() {
		System.out.println("static 修饰的类方法");
	}
	
	public static void main(String[] args) {
		NullAccessStatic nullAccessStatic = null;
		nullAccessStatic.test();

	}

}
