import java.util.Scanner;

public class Problem8 {
	public static int function(int too) {
		return 4 * too * too - 3 *too + 5;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int too;

		System.out.println("RGB7006 - Функц 2\r\n"
				+ "y=4x2-3x+5");
		
		System.out.print("too:");
		too = scn.nextInt();		
		scn.close();
		System.out.println("hariu: " + function(too));
	}
}

