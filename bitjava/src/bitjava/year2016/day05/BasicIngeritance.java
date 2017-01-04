package bitjava.year2016.day05;

public class BasicIngeritance
{

	public static void main(String[] args)
	{
		BusinessMan man1 =new BusinessMan("A", "com", "staff");
		BusinessMan man2 = new BusinessMan("B", "pany", "assist");
		
		man1.tellYourName();
		System.out.println();
		man1.tellYourInfo();
		System.out.println();
		man2.tellYourInfo();

	}

}

class Man
{
	String name;

	public Man(String name)
	{
		this.name = name;
	}

	public void tellYourName()
	{
		System.out.print(name);
	}
}

class BusinessMan extends Man
{

	String company;
	String position;

	public BusinessMan(String name, String company, String position)
	{
		super(name);
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo()
	{
		System.out.println(company);
		System.out.println(position);
		tellYourName();
	}

}