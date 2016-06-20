package crazyjava;

interface Displayable{
	void display();
	default int add(int a,int b){
		return a+b;
	}
}

public class LambdaAndInner {
	private int age = 12;
	private static String name = "疯狂软件教育中心";
	public void test(){
		String book = "疯狂Java讲义";
		//Lambda创建一个Displayable对象
		Displayable displayable = ()->{
		System.out.println("book局部变量："+book);
		System.out.println("外部类的age实例变量: "+age);
		System.out.println("外部类的name类变量: "+name);
		};
		displayable.display();
		System.out.println(displayable.add(3, 5));
	}
	public static void main(String[] args) {

		LambdaAndInner lambdaTest = new LambdaAndInner();
		lambdaTest.test();
	}

}
