package Week2;

import java.util.Scanner;

public class Problem16 {
	public static int factorial(int too) {
		int count = 0;
		while(too > 1) {
			count++;
			too = too / count;
		}
		if(too == 1) {
			System.out.println(count);
		}else if(too < 1) {
			System.out.println("NO");
		}
		return count;
	}
	
	public static void main(String[] args) {
		int too;
		Scanner scn = new Scanner(System.in);

		System.out.println("RGB7312 - Тооны факториал\r\n"
				+ "Өгөгдсөн тоо ямар нэгэн тооны факториал бол \n"
				+ " тэр тоог хэвлэ. Үгүй бол No гэж хэвлэ.");

		too = scn.nextInt();
		scn.close();
		factorial(too);
	}
}
