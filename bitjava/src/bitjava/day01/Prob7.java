package bitjava.day01;

public class Prob7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= i; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}

		}
	}
}