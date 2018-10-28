package crazyjava;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("app"));
//		scanner.useDelimiter("\t");
		while (scanner.hasNextLine()) {
//			String string = (String) scanner.next();
			System.out.println(scanner.nextLine());
		}
		scanner.close();

	}

}
