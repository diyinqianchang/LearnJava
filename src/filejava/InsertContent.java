package filejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 向文件中插入内容
 * 
 * */
public class InsertContent {

	public static void insert(String fileName,long pos ,String insertContent) throws IOException {
		File temp = File.createTempFile("temp", null);
		temp.createNewFile();
		try {
			RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
			FileOutputStream tempOut = new FileOutputStream(temp);  //需要写入缓存文件
			FileInputStream  tempInt = new FileInputStream(temp);    //从缓存文件中读取
			randomAccessFile.seek(pos);
			byte[] bbuf = new byte[64];
			int hasRead = 0;
			while ((hasRead = randomAccessFile.read(bbuf))>0) {
				tempOut.write(bbuf, 0, hasRead);
			}
			randomAccessFile.seek(pos);   //重新回到pos这个指针位置
			randomAccessFile.write(insertContent.getBytes());  //写入要插入的内容
			while ((hasRead = tempInt.read(bbuf))>0) {
				randomAccessFile.write(bbuf, 0, hasRead);   
			}
			tempInt.close();
			tempOut.close();
			randomAccessFile.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		insert("app", 45, "插入内容......");

	}

}
