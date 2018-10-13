package niojava;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesTest {

	public static void main(String[] args) {
		
		try {
//			Paths、Files类
			Path path = Paths.get("a.txt");
			System.out.println(path.getNameCount());
			System.out.println(path.toAbsolutePath());
			System.out.println(path.toAbsolutePath().getRoot());
			List<String> lines = Files.readAllLines(Paths.get("a.txt"),Charset.forName("UTF-8"));
			System.out.println(lines);
			
//			Files.list(Paths.get(".")).forEach(path->System.out.println(path));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
