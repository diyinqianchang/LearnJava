package code7;

import java.util.Objects;

class Address{
	String detail;
	public Address(String detail) {
		// TODO Auto-generated constructor stub
		this.detail = detail;
	}
}

class User implements Cloneable{
	
	int age;
	Address address;
	public User(int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		address = new Address("广州天河");
	}
	
	@Override
	public User clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (User)super.clone();
	}
	
	
}


public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		User u1 = new User(29);
		User u2 = u1.clone();
		System.out.println(u1==u2);
		System.out.println(u1.address == u2.address);
        System.out.println(u1.address.detail);
        System.out.println(u2.address.detail);
        
        User u3 = null;
        
        System.out.println(Objects.requireNonNull(u3, "异常")); //引发空指针异常
        
	}

}
