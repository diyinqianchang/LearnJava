package collectionlearn;

import java.util.HashSet;
import java.util.Iterator;

class A{
	public boolean equals(Object obj) {
		return true;
	}
}
class B{
	public int hashCode(){
		return 1;
	}
}
class C{
	@Override
	public int hashCode() {
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

class R{
	int count;

	public R(int count) {
		this.count = count;
	}
	
	public String toString() {
		return "R[count:"+count+"]";
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
		R other = (R) obj;
		if (count != other.count)
			return false;
		return true;
	}
}

public class SetTest {

	public static void main(String[] args) {
		/*
		 * HashSet类  按Hash算法来存储集合中的元素-->如果要重写hash规则的话,需要重写equals()方法和hashCode()
		 * 不能保证元素的排列顺序，顺序可能与添加顺序不同
		 * HashSet不是线程安全的。两个或以上线程同时修改HashSet集合时，必须通过代码保证同步
		 * 集合元素可以是null
		 * 当向HashSet中添加可变对象时，如果修改了HashSet集合中的对象，有可能导致该对象与集合中的其他对象相等，
		 * 从而导致HashSet无法准确访问该对象
		 */
//		HashSet<Object> books = new HashSet<>();
//		books.add(new A());
//		books.add(new A());
//		books.add(new B());
//		books.add(new B());
//		books.add(new C());
//		books.add(new C());
//		System.out.println(books);
		HashSet<R> hashSet = new HashSet<>();
		hashSet.add(new R(5));
		hashSet.add(new R(-3));
		hashSet.add(new R(9));
		hashSet.add(new R(-2));
		System.out.println(hashSet);
		Iterator<R>iterator = hashSet.iterator();
		R first = (R)iterator.next();
		first.count = -3;
		System.out.println(hashSet);
	}

}
