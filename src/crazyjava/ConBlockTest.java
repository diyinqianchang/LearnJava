package crazyjava;

public class ConBlockTest {
	int a;
	{
		 a = 6;
		if (a>4) {
			System.out.println("局部变量a的值>4");
		}
		System.out.println("ConBlockTest的输出花块");
	}
	   public ConBlockTest() {
		// TODO Auto-generated constructor stub
		   System.out.println("ConBlockTest构造器");
		  
	  }
   public static void main(String[] args) {
	
	 ConBlockTest conBlockTest =   new ConBlockTest();
	 System.out.println(conBlockTest.a);
   }
	
}
