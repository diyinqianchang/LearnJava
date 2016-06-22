package filejava;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			PrintStream pStream = new PrintStream(fos);
			pStream.println("普通字符串");
			pStream.println(new PrintStreamTest());
			pStream.println("锦瑟-李商隐");
			pStream.println("锦瑟无端五十弦，一弦一柱思华年。");
			pStream.println("庄生晓梦迷蝴蝶，望帝春心托杜鹃。");
			pStream.println("沧海月明珠有泪，蓝天日暖玉生烟。");
			pStream.println("此情可待成追忆，只是当时已惘然。");
			pStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
