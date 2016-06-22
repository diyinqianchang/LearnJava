package filejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("app");
			FileOutputStream fos = new FileOutputStream("newfile.txt");
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			while ((hasRead = fis.read(bbuf))>0) {
				//每读取一次，即写入文件输入流
				fos.write(bbuf, 0, hasRead);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
