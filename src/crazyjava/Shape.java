package crazyjava;

public abstract class Shape {

	{
		System.out.println("执行Shape的初始化...");
	}
	private String color;
	public abstract double calPerimeter();
	
	public abstract String getType();
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public  Shape(String color) {
		System.out.println("执行Shape的构造器");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
	
		Shape s1 = new Triangle("黑色", 3, 4, 5);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());

	}

}
class Triangle extends Shape{

	private double a;
	private double b;
	private double c;
	public Triangle(String color, double a, double b, double c) {
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a, double b, double c) {
		if (a>=b+c || b>=a+c || c>=a+b) {
			try {
				throw new Exception("数据出错");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.a = a;
		this.b = b;
		this.c = c;
		
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "三角形";
	}
	
}
