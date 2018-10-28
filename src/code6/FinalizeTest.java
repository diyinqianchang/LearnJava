package code6;



public class FinalizeTest {
	
	
	private static FinalizeTest  fTest = null;
	public void info() {
		System.out.println("测试清理资源");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new FinalizeTest();
		 System.gc();   //通知系统回收垃圾
		 System.runFinalization(); //强制垃圾回收机制调用可恢复对象的finalze()方法
//		 Runtime.getRuntime().runFinalization();
		 fTest.info();
 
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		fTest = this;
	}

}
