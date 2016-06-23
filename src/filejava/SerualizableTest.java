package filejava;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;

public class SerualizableTest {

	public static void main(String[] args) {
        try {
        	/* 1⃣️
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("self.txt"));
			Student student = new Student("张", 26);
			oos.writeObject(student);
			oos.close();
			
        	ObjectInputStream iis = new ObjectInputStream(new FileInputStream("self.txt"));
        	Student student1 = (Student)iis.readObject();
        	System.out.println(student1.getName());
        	iis.close();
        	*/
        	/*
        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("self2.txt"));
        	Student student = new Student("张", 26);
        	oos.writeObject(student);
        	oos.close();
        	*/
        	ObjectInputStream iis = new ObjectInputStream(new FileInputStream("self2.txt"));
        	@SuppressWarnings("unchecked")
			ArrayList<Object> list2 = (ArrayList<Object>)iis.readObject();
        	System.out.println(list2);
        	iis.close();
		} catch (IOException | ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	public Student(String name, int age) {
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
	/* 1⃣️
	private void writeObject(java.io.ObjectOutputStream out) throws IOException{
		System.out.println("执行写入");
		out.writeObject(new StringBuffer(name).reverse());
		out.writeInt(age);
	}
	private void readObject(java.io.ObjectInputStream in) throws IOException,ClassNotFoundException {
		System.out.println("执行读取");
		this.name = ((StringBuffer)in.readObject()).reverse().toString();
		this.age = in.readInt();
	}*/
	private Object writeReplace() throws ObjectStreamException {
		System.out.println("执行写入");
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(age);
		return list;
	}
}