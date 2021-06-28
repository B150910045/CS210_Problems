package Week2;

import java.util.Scanner;

public class Problem17 {
	public static int max_index(int[] too, int hemjee) {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <hemjee; i++) {
			if(too[i] > max) {
				max = too[i];
				index = i;
			}
		}
		
		System.out.print(max + " ");
		if(max > 1) {
			System.out.print(index);
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] too;
		int hemjee;
		Scanner scn = new Scanner(System.in);

		System.out.println("RGB7507 - Массивын их нь хэд дэх\r\n"
				+ "Өгөгдсөн нэг хэмжээст бүхэл тоон массивын \n"
				+ "хамгийн их элемент хэд дэх нь вэ? Хэрэв \n"
				+ "хамгийн их элемент 1-ээс их бол бага дугаарыг \n"
				+ " нь хэвлэнэ.");

		hemjee = scn.nextInt();
		too = new int [hemjee];
		for(int i = 0; i < hemjee; i++) {
			too[i] = scn.nextInt();
		}
		scn.close();
		max_index(too, hemjee);
	}
}
