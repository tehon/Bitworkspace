package bitjava.year2016.day03;

import java.util.Scanner;

public class Prob09
{
	//compareTo
	//문자열데이터를 가진 StringBuffer 클래스를 생성하고, 이를 주어진 문자열과 비교하는 코드를 작성하세요
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer(); //StringBuffer sb = new StringBuffer("BitAcademy");
		sb.append("BitAcademy");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		System.out.print(sb.toString().compareTo(input));
		if(sb.toString().compareTo(input)<0){
			System.out.println(
					"비트아카데미가 앞섬"
					);
		}
		else if(sb.toString().compareTo(input)>0){
			System.out.println(
					"ㄴ 앞섬"
					);
		}
		else{
			System.out.println(
					"ㅁ똑같 ㅇ"
					);	
		}
	}

}
