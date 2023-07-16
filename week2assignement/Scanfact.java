package week2assignement;

import java.util.Scanner;

public class Scanfact {
	public static void main(String[] args) {
		Scanner nums = new Scanner(System.in);
		System.out.println("enter number");
		int num = nums.nextInt();

		int count = 1;
		for (int i = 1; i <= num; i++) {
			count = count * i;
			System.out.println(i);
		}
		System.out.println(count);

	}
}
