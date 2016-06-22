package filejava;


import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {

	public static void main(String[] args) {
		//字符串节点   而不是文件节点
		String src = "从明天起，做一个幸福的人\n"
				+"喂马，劈柴，周游世界\n"
				+"从明天起，关心粮食和蔬菜\n"
				+"我有一所房子，面朝大海，春暖花开\n"
				+"告诉他们我的幸福\n";
		char [] buffer = new char[32];
		int hasRead = 0;
		try {
			StringReader sr = new StringReader(src);
			while ((hasRead = sr.read(buffer))>0) {
				System.out.println(new String(buffer,0,hasRead));
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			StringWriter sw = new StringWriter();
			sw.write("有一个美丽的世界,\n");
			sw.write("她在远方等我\n");
			sw.write("那里有天真的孩子\n");
			sw.write("还有姑娘的酒窝\n");
			System.out.println(sw.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
