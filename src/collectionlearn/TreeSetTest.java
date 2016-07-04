package collectionlearn;

import java.util.TreeSet;

public class TreeSetTest {

	/*
	 * TreeSet是SortedSet接口的实现类，可以确保集合元素处于排序状态。
	 * 
	 * 根据元素实际的大小值来排序
	 * 
	 * 不能添加不同类型的数据 添加的类要实现Comparaable
	 */
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>((i1,i2)->{
			return i1>i2 ? -1: i1<i2 ? 1:0;
		});
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(10);
		treeSet.add(-9);
		System.out.println(treeSet);
		System.out.println(treeSet.first());    //
		System.out.println(treeSet.higher(2));
		System.out.println(treeSet.lower(9));
		System.out.println(treeSet.headSet(8));
	}

}
