package crazyjava;

public class Recursive {

	//类方法
	public static  int fn(int n) {
		if (n==0) {
			return 1;
		}else if (n==1) {
			return 4;
		}else {
			return 2*fn(n-1) + fn(n-2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(fn(10));
	}

}
