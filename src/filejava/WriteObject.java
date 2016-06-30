package filejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 对象序列化
 * */
public class WriteObject {

	public static void main(String[] args) {
		
		try {
			/*
			 * 写入 序列化后的对象
			 * */
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
//			Person person = new Person("孙悟空", 500);
//			oos.writeObject(person);
//			oos.close();
			/*
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
			Person person = (Person)ois.readObject();
			System.out.println(person.getAge()+"--->"+person.getName());
			ois.close();
			*/
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("teacher.txt"));
			Person person = new Person("孙悟空", 500);
			Teacher t1 = new Teacher("唐僧", person);
			Teacher t2 = new Teacher("菩提祖师", person);
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(person);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt"));
			Teacher teacher1 = (Teacher)ois.readObject();
			Teacher teacher2 = (Teacher)ois.readObject();
			System.out.println(teacher1.getName());
			System.out.println(teacher2.getName());
			ois.close();
		} catch (Exception e) {
		}
	}
}
class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Teacher implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Person student;
	public Teacher(String name, Person student) {
		this.name = name;
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person getStudent() {
		return student;
	}
	public void setStudent(Person student) {
		this.student = student;
	}
}