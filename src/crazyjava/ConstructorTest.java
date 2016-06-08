package crazyjava;
public class ConstructorTest {
	public String name;
	public int count;
	public ConstructorTest(String name, int count) {
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args) {
		ConstructorTest constructorTest = new ConstructorTest("疯狂Java讲义", 9000);
		System.out.println(constructorTest.name);
		System.out.println(constructorTest.count);
	}
}
