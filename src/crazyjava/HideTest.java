package crazyjava;

class Parent{
	public String tag = "crazy java";
}
class Derived extends Parent{
//	private String tag = "轻量级Java EE";
			
}

public class HideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived derived = new Derived();
//		System.out.println(derived.tag);
		System.out.println(((Parent)derived).tag);
	}
}
