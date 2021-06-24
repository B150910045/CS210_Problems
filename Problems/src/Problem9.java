import java.util.Scanner;

public class Problem9 {
	public static int function(int too) {
		return 4 * too * too - 3 *too + 5;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int too1, too2;

		System.out.println("RGB7003 - Тэгш өнцөгт\r\n"
				+ "Өгөгдсөн тэгш өнцөгтийн талбай ба периметрийг ол.");
		
		System.out.print("too1:");
		too1 = scn.nextInt();	
		System.out.print("too2:");
		too2 = scn.nextInt();		
		scn.close();
		
		int talbai = too1 * too2;
		int perimeter = 2 * (too1 + too2);
		System.out.print(talbai + " " + perimeter);
	}
}

