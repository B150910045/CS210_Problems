package Week2;

import java.util.Scanner;

public class Problem18 {
	public static int max_index(int[] too, int hemjee) {
		int niilber = 0;
		for(int i = 0; i <hemjee; i++) {
			niilber = niilber + too[i];
		}
		return niilber;
	}
	
	public static void main(String[] args) {
		int[] too;
		int hemjee;
		Scanner scn = new Scanner(System.in);

		System.out.println("RGB7500 - Массив нийлбэр\r\n"
				+ "Өгөгдсөн бүхэл тоон дарааллын гишүүдийн нийлбэрийг ол.");

		hemjee = scn.nextInt();
		too = new int [hemjee];
		for(int i = 0; i < hemjee; i++) {
			too[i] = scn.nextInt();
		}
		scn.close();
		System.out.println(max_index(too, hemjee));
	}
}
