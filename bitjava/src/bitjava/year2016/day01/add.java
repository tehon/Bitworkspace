package bitjava.year2016.day01;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum;
		int x, y;

		System.out.print("첫번째 숫자 입력 좀 :");
		x = input.nextInt();

		System.out.print("두번째 숫자 입력 :");
		y = input.nextInt();

		sum = x / y;
		System.out.println(sum);
	}

}
