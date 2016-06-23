package niojava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class FileLockTest {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * Exception in thread "main" java.nio.channels.NonWritableChannelException
	       at sun.nio.ch.FileChannelImpl.tryLock(FileChannelImpl.java:1072)
	       at java.nio.channels.FileChannel.tryLock(FileChannel.java:1155)
	       at niojava.FileLockTest.main(FileLockTest.java:16)
		 * */
		try {
			FileInputStream inputStream= new FileInputStream("a.txt");
			FileChannel channel = inputStream.getChannel();
			FileLock lock = channel.tryLock();
			Thread.sleep(1000);
			lock.release();
			channel.close();
			inputStream.close();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
