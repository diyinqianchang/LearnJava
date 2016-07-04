package collectionlearn;

import java.util.Hashtable;



class G{
	int count;
	public G(int count) {
		this.count = count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		G other = (G) obj;
		if (count != other.count)
			return false;
		return true;
	}
}
class D {
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}
public class HashtableTest {
	public static void main(String[] args) {
		Hashtable<G, Object>tHashtable = new Hashtable<>();
		tHashtable.put(new G(6000), "疯狂Java讲义");
		tHashtable.put(new G(87563), "疯狂Java EE讲义");
		tHashtable.put(new G(1232), new D());
		System.out.println(tHashtable);
		System.out.println(tHashtable.containsValue("测试字符"));
	}
}
