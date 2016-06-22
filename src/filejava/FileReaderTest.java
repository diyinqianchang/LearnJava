package filejava;

import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try {
			FileReader fReader = new FileReader("app");
			char[] cbuf = new char[32];    //字符流
			int hasRead = 0;
			while ((hasRead = fReader.read(cbuf))>0) {
				System.out.println(new String(cbuf, 0, hasRead));
			}
			fReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}

	}

}
