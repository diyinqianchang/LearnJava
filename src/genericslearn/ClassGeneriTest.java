package genericslearn;



class Apple<T>{
	private T info;
	public Apple(){};
	public Apple(T info) {
		this.info = info;
	}
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	
}

class AppleSub extends Apple<String>{
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return  "子类"+super.getInfo();
	}
	@Override
	public void setInfo(String info) {
		// TODO Auto-generated method stub
		super.setInfo(info);
	}
}

public class ClassGeneriTest {

	public static void main(String[] args) {
		
		Apple<String> al = new Apple<>("苹果");
		System.out.println(al.getInfo());
		Apple<Double> al2 = new Apple<>(5.97);
		System.out.println(al2.getInfo());

	
	}

}
