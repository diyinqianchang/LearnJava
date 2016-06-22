package filejava;

import java.io.File;
//import java.io.FilenameFilter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File(".");
		System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getAbsoluteFile());
        
        File temFile = File.createTempFile("aaa", "txt",file);
		temFile.deleteOnExit();
		
		/*
		 * 文件过滤器
		 * */
//		FilenameFilter filenameFilter = new FilenameFilter() {
//			
//			@Override
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return false;
//			}
//		};
		
		
		File newFile = new File(System.currentTimeMillis()+"");
		newFile.createNewFile();
		newFile.mkdir();
		
		String[] fileList = file.list();
		for (String string : fileList) {
			System.out.println(string);
		}
		File [] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
		}
	}

}
