package bitjava.day02;

class Number {
	int num;

	public Number() {
		num = 30;
		System.out.println("������ ȣ��");

	}

	public int getNumber() {
		return num;
	}
}

public class Constructor01 {

	public static void main(String[] args) {
		Number num1 = new Number();
		System.out.println(num1.getNumber());
		
		Number num2 = new Number();
		System.out.println(num2.getNumber());
	}

}