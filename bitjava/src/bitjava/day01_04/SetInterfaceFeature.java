package bitjava.day01_04;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterfaceFeature
{

	public static void main(String[] args)
	{
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("first");
		hSet.add("firse");
		hSet.add("firsw");
		hSet.add("firsx");
		hSet.add("first");

		System.out.println(hSet.size());
		Iterator<String> itr = hSet.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());

		}
	}

}
