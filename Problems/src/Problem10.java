import java.util.Scanner;

public class Problem10 {
	public static String function(int too) {
		switch(too){
			case 2:
				return "Muu";
			case 3:
				return "Dund";
			case 4:
				return "Sain";
			case 5:
				return "Onts";
			default:
				return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int too;

		System.out.println("\r\n"
				+ "RGB7116 - 5-аас онц руу\r\n"
				+ "Өгөгдсөн тоон дүнг үсгэн дүн рүү шилжүүл.");
		
		System.out.print("too:");
		too = scn.nextInt();	
		scn.close();
		
		System.out.println(function(too));
	}
}

