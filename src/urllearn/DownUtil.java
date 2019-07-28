package urllearn;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DownUtil {
	
	private String path;
	private String targetFile;
	private int threadNum;
	private DownThread[] threads;
	private int fileSize;
	
	public DownUtil(String path,String targetFile,int threadNum) {
		// TODO Auto-generated constructor stub
		this.path = path;
		this.targetFile = targetFile;
		this.threadNum = threadNum;
		threads = new DownThread[this.threadNum];
	}
	
	public void download() throws Exception {
		
		URL url = new URL(path);
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setConnectTimeout(5*1000);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "image/gif,image/jpeg,image/pjpeg,"+
		"application/x-shockwave-flash,application/xaml+xml,"+
				"application/vnd.ms-xpsdocument,application/x-ms-xbap,"+
		"application/x-ms-application,application/vnd.ms-excel,"+
				"application/vnd.ms-powerpoint,application/msword,*/*");
		conn.setRequestProperty("Accept-Language", "zh-CN");
		conn.setRequestProperty("Charset", "UTF-8");
		conn.setRequestProperty("Connection", "Keep-Alive");
		fileSize = conn.getContentLength();
		conn.disconnect();
		
		int currentPartSize = fileSize/threadNum+1;
		RandomAccessFile file = new RandomAccessFile(targetFile, "rw");
		file.setLength(fileSize);
		file.close();
		
		for(int i = 0;i<threadNum;i++){
			int startPos = i*currentPartSize;
			RandomAccessFile currentPart = new RandomAccessFile(targetFile, "rw");
			currentPart.seek(startPos);
			threads[i] = new DownThread(startPos, currentPartSize, currentPart);
			threads[i].start();
		}
		
	}
	
	
	
	private class DownThread extends Thread{
		
		private int startPos;
		private int currentPartSize;
		private RandomAccessFile currentPart;
		public int length;
		
		public DownThread(int startPos,int currentPartSize,RandomAccessFile currentPart) {
			// TODO Auto-generated constructor stub
			super();
			this.startPos = startPos;
			this.currentPart = currentPart;
			this.currentPartSize = currentPartSize;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				URL url = new URL(path);
				HttpURLConnection conn = (HttpURLConnection)url.openConnection();
				conn.setConnectTimeout(5*1000);
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "image/gif,image/jpeg,image/pjpeg,"+
				"application/x-shockwave-flash,application/xaml+xml,"+
						"application/vnd.ms-xpsdocument,application/x-ms-xbap,"+
				"application/x-ms-application,application/vnd.ms-excel,"+
						"application/vnd.ms-powerpoint,application/msword,*/*");
				conn.setRequestProperty("Accept-Language", "zh-CN");
				conn.setRequestProperty("Charset", "UTF-8");
				InputStream inputStream = conn.getInputStream();
				inputStream.skip(this.startPos);
				byte[] buffer = new byte[1024];
				int hasRead = 0;
				while (length<currentPartSize &&(hasRead = inputStream.read(buffer))!=-1) {
					
					currentPart.write(buffer,0,buffer.length);
					length+=hasRead;
				}
				currentPart.close();
				inputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	

}
