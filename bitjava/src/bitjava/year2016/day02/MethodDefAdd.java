package bitjava.year2016.day02;

public class MethodDefAdd
{

	public static void main(String[] args)
	{
		/*
		 * System.out.println("시작");
		 * hiEveryon(13);
		 * hiEveryon(20);
		 * System.out.println("종료");
		 */
		add(5, 3);
		scope(3, 5);
		Otherclass ad = new Otherclass();
		ad.otheradd(25, 37);
		int returnint = ad.returnadd(20, 30);
		System.out.println("돌아온더하기 값" + returnint);
		Calc calc = new Calc(3, 5);
	}

	/*
	 * public static void hiEveryon(int age){
	 * System.out.println("hi 시작 ");
	 * System.out.println("나이는 "+age);
	 * System.out.println("hi 끝 ");
	 * }
	 */
	public static void add(int a, int b)
	{
		System.out.println("더하기 : " + (a + b));

		System.out.println("빼기 : " + (a - b));

		System.out.println("곱하기 : " + (a * b));

		System.out.println("나누기 : " + (a / b) + " 나머지 : " + (a % b));
	}

	public static void scope(int a, int b)
	{
		/*
		 * int result=a-b;
		 * if(result<0){
		 * result=-(result);
		 * }
		 */
		int result = Math.abs(a - b);
		System.out.println("절대값 : " + result);
	}
}

class Otherclass
{
	public void otheradd(int a, int b)
	{
		int result = -(a - b);
		System.out.println("other절대값 : " + result);
	}

	public int returnadd(int a, int b)
	{
		int result = (a + b);
		return result;
	}
}

class Calc
{
	int num1;
	int num2;

	public Calc(int a, int b)
	{
		num1 = a;
		num2 = b;
		System.out.println("calc 실행됨");

	}
}