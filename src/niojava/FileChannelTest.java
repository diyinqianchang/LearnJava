package niojava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
public class FileChannelTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("app");
		try {
			//复制文件。
			FileChannel inChannel = new FileInputStream(f).getChannel();
			FileChannel outChannel = new FileOutputStream("a.txt").getChannel();
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			Charset charset = Charset.forName("UTF-8");
			outChannel.write(buffer);
			buffer.clear();
			
			//读取文件一次行读取全部内容
			CharBuffer charBuffer = charset.decode(buffer);
			System.out.println(charBuffer);
			inChannel.close();
			outChannel.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
