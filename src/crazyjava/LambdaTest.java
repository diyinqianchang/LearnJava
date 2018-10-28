package crazyjava;


@FunctionalInterface
interface Converter{
	Integer convert(String from);
}

interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}
interface Addable{
	int add(int a,int b);
}
public class LambdaTest {

	public void eat(Eatable e){
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f){
		System.out.println(f);
		f.fly("映日荷花别样红");
	}
	public void test(Addable add){
		System.out.println("5与3的和为："+add.add(5, 3));
	}
	public static void main(String[] args) {
		LambdaTest lq = new LambdaTest();
//		
		Eatable eatable = ()->System.out.println("haha");
		lq.eat(eatable);

//		lq.eat(()->System.out.println("苹果味道不错"));
//		lq.eat(new Eatable() {
//			
//			@Override
//			public void taste() {
//				System.out.println("hehehehhe");
//			}
//		});
//		
//		lq.drive(weather->{
//			System.out.println("今天天气是："+weather);
//			System.out.println("飞行平稳");
//		});
//		lq.drive(new Flyable() {
//			@Override
//			public void fly(String weather) {
//				System.out.println("今天天气是："+weather);
//				System.out.println("飞行平稳");
//			}
//		});
//		lq.test((a,b)->a+b);
//		Addable addable = (a,b)-> a+b;
//		lq.test(addable);
//		lq.test(new Addable() {
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		});
//		Converter converter1 = from -> Integer.valueOf(from);
//		Integer val = converter1.convert("99");
//		System.out.println(val);
//		Converter converter2 = Integer::valueOf;
//		System.out.println(converter2.convert("23"));
	}
	

	
	
	

}
