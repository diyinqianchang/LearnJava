package crazyjava;

public class InnerClass {

	private double weight;
	public InnerClass() {
		// TODO Auto-generated constructor stub
	}
	public InnerClass(double weight) {
		this.weight = weight;
	}
	private class CowLeg{
		private double length;
		private String color;
		public CowLeg(double length,String color) {
			this.color = color;
			this.length = length;
		}
		public void info(){
			System.out.println("当前牛腿颜色是："+color +",高:"+length);
			//调用外部类的成员变量
			System.out.println("牛腿所在奶牛重: "+weight);
		}
		
	}
	public void test(){
		CowLeg cLeg = new CowLeg(1.12, "黑白相间");
		cLeg.info();
	}
	public static void main(String[] args) {
		InnerClass innerClass = new InnerClass(378.9);
		innerClass.test();
	}

}
