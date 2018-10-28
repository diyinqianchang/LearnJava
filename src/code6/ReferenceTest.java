package code6;

import java.lang.ref.WeakReference;

public class ReferenceTest {

	public static void main(String[] args) {
		
		String string = new String("疯狂Java讲义");
		WeakReference wReference = new WeakReference(string);
		string = null;
		System.out.println(wReference.get());
		System.gc();
		System.runFinalization();
		System.out.println(wReference.get());

	}

}
