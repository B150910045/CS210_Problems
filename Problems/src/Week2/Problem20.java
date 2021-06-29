package Week2;

import java.util.Scanner;

public class Problem20 {
	public static void function(int too) {
		int temp = too;
		for(int i = 0; i < too; i++) {
			for(int j = 0; j < temp; j++) {
				System.out.print(too - j + " ");
			}
			System.out.print("\n");
			temp--;
		}
	}
	
	public static void main(String[] args) {
		int too;
		Scanner scn = new Scanner(System.in);

		System.out.println("\r\n"
				+ "RGB7405 - Давхар давталт 5\r\n"
				+ "Өгөгдсөн тоон тусламтайгаар жишээн дээрхтэй төстэй тоон хэлбэрийг үүсгэ.");

		too = scn.nextInt();
		scn.close();
		function(too);
	}
}
