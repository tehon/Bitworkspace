package bitjava.day01_02;

public class AbstractInterface
{

	public static void main(String[] args)
	{
		PersonalNumberStorage storage = new PersonalNumberStorageImple(100);
		storage.addPersonalInfo("lee", "92303-2");
		storage.addPersonalInfo("231", "ssd");

		System.out.println(storage.searchName("231"));
		System.out.println(storage.searchName("lee"));
	}

}

/*abstract class PersonalNumberStorage
{
	public abstract void addPersonalInfo(String perNum, String name);

	public abstract String searchName(String perNum);

}*/
interface PersonalNumberStorage
{
	void addPersonalInfo(String perNum, String name);

	String searchName(String perNum);

}
class PersonalNumInfo
{
	String name;
	String number;

	PersonalNumInfo(String name, String number)
	{
		this.name = name;
		this.number = number;
	}

	String getName()
	{
		return name;
	}

	String getNumber()
	{
		return number;
	}
}

class PersonalNumberStorageImple implements PersonalNumberStorage   //위에 abstract 썼을 때는 상속개념으로 들어가서 extends..
{
	PersonalNumInfo[] perArr;
	int numOfPerInfo;

	public PersonalNumberStorageImple(int sz)
	{
		perArr = new PersonalNumInfo[sz];
		numOfPerInfo = 0;
	}

	public void addPersonalInfo(String name, String perNum)
	{
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;
	}

	public String searchName(String perNum)
	{
		for (int i = 0; i < numOfPerInfo - 1; i++)
		{
			if (perNum.compareTo(perArr[i].getNumber()) == 0)
			{
				return perArr[i].getName();
			}

		}
		return null;
	}
}