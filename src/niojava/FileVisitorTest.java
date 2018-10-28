package niojava;


import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;


public class FileVisitorTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		E:\资料\Java\LearnJava
		
		Files.walkFileTree(Paths.get("E:", "资料","Java","LearnJava"), new SimpleFileVisitor<Path>() {
			 @Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
				// TODO Auto-generated method stub
				 if (file.getFileName().endsWith(".txt")) {
					 System.out.println(file);
					 return FileVisitResult.TERMINATE;
				}
				
				return FileVisitResult.CONTINUE;
			}
			 
			 @Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				// TODO Auto-generated method stub
				return super.preVisitDirectory(dir, attrs);
			}
		});

	}

}
