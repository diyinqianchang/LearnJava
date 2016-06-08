package crazyjava;
class Bird {
	protected void fly() {
		System.out.println("我在天空自由的翱翔");
	}
}
public class Ostrich extends Bird{
	@Override
	public void fly() {
		System.out.println("我只能在地上奔跑");
	}
	public static void main(String[] args) {
		Ostrich ostrich = new Ostrich();
		ostrich.fly();
	}
}