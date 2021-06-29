package Week2;

import java.util.Scanner;

public class Problem20 {
	public static boolean sondgoi(int[] too, int hemjee) {
		int count = 0;
		for(int i = 0; i <hemjee; i++) {
			if(too[i] % 2 == 1)
				count++;
		}
		return ((hemjee / 2) < count);
	}
	
	public static void main(String[] args) {
		int[] too;
		int hemjee;
		Scanner scn = new Scanner(System.in);

		System.out.println("\r\n"
				+ "RGB7503 - Сондгой нь их үү\r\n"
				+ "Нэг хэмжээст массив дахь сондгой тоонууд нь \n"
				+ " тэгш тоонуудаасаа их бол YES, үгүй \n"
				+ "бол NO гэж хэвлэ.");

		hemjee = scn.nextInt();
		too = new int [hemjee];
		for(int i = 0; i < hemjee; i++) {
			too[i] = scn.nextInt();
		}
		scn.close();
		System.out.println(sondgoi(too, hemjee));
	}
}
