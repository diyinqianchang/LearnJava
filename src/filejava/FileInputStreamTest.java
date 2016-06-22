package filejava;

import java.io.FileInputStream;
import java.io.IOException;
public class FileInputStreamTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = new FileInputStream("app");
		byte[] bbuf = new byte[1024];   //字节流
		int hasRead = 0;
		while ((hasRead = fileInputStream.read(bbuf))>0) {
			System.out.println(new String(bbuf,0,hasRead));
		}
		fileInputStream.close();
	}

}
