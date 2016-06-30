package niojava;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ReadFile {
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("a.txt");
			FileChannel inChannel = fis.getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate(256);
			System.out.println("---->");
			while (inChannel.read(byteBuffer)!=-1) {
				byteBuffer.flip();
				Charset charset = Charset.forName("UTF-8");
				//采用解码器这种方式不对的
//				CharsetDecoder decoder = charset.newDecoder();
				CharBuffer cBuffer = charset.decode(byteBuffer);
				System.out.println("---->"+cBuffer);
//				System.out.println(byteBuffer.asCharBuffer());
				byteBuffer.clear();	
			}
			System.out.println("---->");
			inChannel.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}