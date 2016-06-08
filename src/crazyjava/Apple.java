package crazyjava;

/*
 *构造器重载
 **/
public class Apple {

	public String name;
	public String color;
	public double weight;
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	public Apple(String name,String color){
		this.color = color;
		this.name = name;
	}
	public Apple(String name,String color,double weight){
		this(name, color); //调用该类的另一个带有两个字符串参数的构造器
		this.weight = weight;
	}
	@Override   //重写toString方法
	public String toString() {
		// TODO Auto-generated method stub
		
//		return "Apple [color=" +color + ", weight="+ weight "]";
		
		return "一个苹果的颜色"+color+" ,重量是:"+weight;
	}
	public static void main(String[] args) {
		

	}

}
