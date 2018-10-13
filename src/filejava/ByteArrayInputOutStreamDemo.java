package filejava;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputOutStreamDemo {

	public static void main(String[] args) throws IOException {
		
//		String string = "Hello World";
//		ByteArrayInputStream bis = new ByteArrayInputStream(string.getBytes());
////		byte[] result = new byte[1024];
//		int hasRead = -1;
//		while ((hasRead=bis.read())!=-1) {
//			System.out.print((char)hasRead);
//		}
		
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		byteArrayOutputStream.write(97);
		byteArrayOutputStream.write("hello".getBytes());
	     byte[] buff = byteArrayOutputStream.toByteArray();
	     
	     for (byte b : buff) {
			System.out.print((char)b);
		}
	     
	     FileOutputStream fileOutputStream = new FileOutputStream("d:\\aa.txt",true);
	     byteArrayOutputStream.writeTo(fileOutputStream);
	     fileOutputStream.close();
	}

}
