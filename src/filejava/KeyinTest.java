package filejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {

	public static void main(String[] args) throws IOException {
		
		//将System.in对象转换成Reader对象   转换流
		InputStreamReader reader = new InputStreamReader(System.in);
		//将普通的Reader包装成BufferedReader
		BufferedReader bReader = new BufferedReader(reader);
		
		String line = null;
		while ((line = bReader.readLine())!=null) {
			if (line.equals("exit")) {
				System.exit(1);
			}
			System.out.println("输入内容："+line);
		}

	}

}
