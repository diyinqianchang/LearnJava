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
		System.out.println("����������"+runtime.availableProcessors());
		System.out.println("�����ڴ�"+runtime.freeMemory());
		System.out.println("���ڴ�"+runtime.totalMemory());
		//�򿪼��±�����
//	    runtime.exec("notepad");
		System.out.println(System.currentTimeMillis());

	}

}
