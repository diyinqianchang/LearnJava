package crazyjava;

public class FnalClass {

	private final Name name;
	public FnalClass(Name name) {
		this.name = name;
	}
	public Name getName() {
		return name;
	}
	public static void main(String[] args) {
		Name name = new Name("悟空","孙");
		FnalClass fnalClass = new FnalClass(name);
		System.out.println(fnalClass.getName().getFirstName());
		name.setFirstName("八戒");
		System.out.println(fnalClass.getName().getFirstName());
	}

}

class Name{
	private String firstName;
	private String lastName;
	public Name() {
		// TODO Auto-generated constructor stub
	}
	public  Name(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}