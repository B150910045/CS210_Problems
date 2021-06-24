import java.util.Scanner;

public class Problem7 {
	public static int function(int too) {
		return 3 * too - 5;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int too;

		System.out.println("\r\n"
				+ "RGB7005 - Функц 1\r\n"
				+ "y=3x-5");
		
		System.out.print("too:");
		too = scn.nextInt();		
		scn.close();
		System.out.println("hariu: " + function(too));
	}
}

