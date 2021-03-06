package bitjava.year2016.day03;

public class Prob18
{
	//- 없애는 건데 substring 사용하는 방법이랑 StringBuilder 클래스 이용하는 방법
	public static void main(String[] args)
	{
		String str = "990102-1012345";
		StringBuilder sb = new StringBuilder(str);
		//str=str.replaceAll(str.substring(str.indexOf("-")), "");

		System.out.println(str.replaceAll("-", ""));
		// substring 사용하는 방법
		System.out.println(str.substring(0, 6) + str.substring(7));
		
		System.out.println(str.substring(0,str.indexOf("-"))+str.substring(7));

		//StringBuilder 클래스 이용하는 방법
		//sb.append(sb.replace(start, end, "-"));
		//sb.append(sb.toString().replaceAll("-", ""));
		//sb.deleteCharAt(sb.toString().indexOf("-"));
		sb.deleteCharAt(sb.indexOf("-"));
		//System.out.println(str);
		System.out.println(sb);
	}

}
