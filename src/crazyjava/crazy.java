package crazyjava;

public class crazy {

	/*
	 * static可以修饰方法、成员变量等成员。static修饰的成员表明它属于这个类本身，
	 * 而不属于该类的单个实例。static修饰的成员变量和方法也称为类变量和类方法。
	 * 不使用static修饰的普通方法、成员变量则属于该类的单个实例、而不属于该类。
	 * 对于static修饰的方法而言，则可以使用类来直接调用该方法。如果在static修饰的
	 * 方法中使用this关键，则这个关键字无法指向合适的对象。不能使用this引用。
	 * 静态成员不能直接访问非静态成员。
	 * */
	/*
	 * 成员变量无需显示初始化，只要为一个类定义了类变量或实例变量。
	 * 系统就会在这个类准备阶段或创建给类的实例进行默认初始化
	 * */
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(Person.eyeNum);
		Person.eyeNum = 3;
		person.name = "李刚";
		person.say("Java语言很简单，学习很容易");
		System.out.println(Person.eyeNum);

	}
	

}
