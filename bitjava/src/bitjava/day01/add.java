package bitjava.day01;

import java.util.Scanner;

public class add {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum;
		int x, y;

		System.out.print("ù��° ���� �Է� �� :");
		x = input.nextInt();

		System.out.print("�ι�° ���� �Է� :");
		y = input.nextInt();

		sum = x / y;
		System.out.println(sum);
	}

}