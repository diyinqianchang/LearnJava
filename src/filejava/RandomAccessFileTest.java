package filejava;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile randomAccessFile= new RandomAccessFile("app", "rw");
			System.out.println("指针位置"+randomAccessFile.getFilePointer());
			randomAccessFile.seek(randomAccessFile.length());
			randomAccessFile.write("\n追加内容".getBytes());  //将指针移到最后， 然后写入
//			读取文件内容
//			byte[] bbuf = new byte[1024];
//			int hasRead = 0;
//			while ((hasRead = randomAccessFile.read(bbuf))>0) {
//				System.out.println(new String(bbuf,0,hasRead));
//			}
			randomAccessFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
