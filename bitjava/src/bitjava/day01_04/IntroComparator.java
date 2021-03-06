package bitjava.day01_04;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeSet;

public class IntroComparator
{

	public static void main(String[] args)
	{
		TreeSet<String> tree = new TreeSet<String>();

		tree.add("ORAGE");
		tree.add("Straw");
		Iterator<String> itr = tree.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}

class StrLenComparator implements Comparable<String>
{
	public int compareTo(String s1, String s2)
	{
		return s1.length() - s2.length();
	}

	@Override
	public int compareTo(String o)
	{
		return 0;
	}

}
