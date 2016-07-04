package genericslearn;

import java.util.ArrayList;
import java.util.Collection;

public class MethodGeneriTest {

	static <T>void fromArrayToCollecion(T[] a, Collection<T>c){
		for (T t : a) {
			c.add(t);
		}
	}
	public static void main(String[] args) {
		Object[] oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		fromArrayToCollecion(oa, co);
	}

}
