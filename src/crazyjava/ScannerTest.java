package crazyjava;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = (String) scanner.next();
			System.out.println(string);
		}
		scanner.close();

	}

}
