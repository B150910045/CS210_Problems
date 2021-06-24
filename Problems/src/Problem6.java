import java.util.Scanner;

public class Problem6 {
	public static boolean tegsh_eseh(int too) {
		boolean bool;
		if(too % 2 == 0) {
			bool = true;
		}else {
			bool = false;
		}
		return bool;
	}
	
	public static void main(String[] args) {
		int n = 3;
		Scanner scn = new Scanner(System.in);
		int[] toonuud = new int[n];

		System.out.println("\r\n"
				+ "RGB7114 - Тэгш тоонууд YES\r\n"
				+ "Гурван тоо өгөгдөнө. Тоо тэгш бол YES үгүй бол NO гэж хэвлэ.");
		
		for(int i = 0; i < n; ++i) {
			System.out.print("too " + (i+1) + " :");
			toonuud[i] = scn.nextInt();
		}
		
		scn.close();
		
		for(int i = 0; i < n; i++) {
			System.out.println(tegsh_eseh(toonuud[i]));
		}
	}
}
