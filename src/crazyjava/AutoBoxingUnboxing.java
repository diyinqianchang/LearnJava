package crazyjava;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
//		Integer inObj = 5;
		Object boolObj = true;
		int it = Integer.parseInt("123");
		System.out.println(it);
		
		if (boolObj instanceof Boolean) {
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
		int val = Integer.parseUnsignedInt("123",10);
		System.out.println(val);
	}

}
