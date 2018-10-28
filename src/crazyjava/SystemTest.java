package crazyjava;


import java.util.Map;

public class SystemTest {

	public static void main(String[] args) throws Exception {
//		Map<String, String> env = System.getenv();
//		for (String name : env.keySet()) {
//			System.out.println(name+"---->"+env.get(name));
//		}
//		
		Runtime runtime = Runtime.getRuntime();
		System.out.println("处理器数量"+runtime.availableProcessors());
		System.out.println("空闲内存"+runtime.freeMemory());
		System.out.println("总内存"+runtime.totalMemory());
		//打开记事本程序
//	    runtime.exec("notepad");
		System.out.println(System.currentTimeMillis());

	}

}
