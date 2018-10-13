package filejava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInOutputStreamDemo {

	public static void main(String[] args) throws IOException {
	
		FileUtil.copyFile(new File("a.txt"), new File("d://b.txt"));

	}

}

class FileUtil{
	public static void copyFile(File src,File des) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(des);
		
		BufferedInputStream buffis = new BufferedInputStream(fis);
		BufferedOutputStream buffos = new BufferedOutputStream(fos);
		
		int data = 0;
		while ((data=buffis.read())!=-1) {
			buffos.write(data);
		}
		buffis.close();
		buffos.close();
	}
}



