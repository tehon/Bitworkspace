package bitjava.day01_04;

import java.util.ArrayList;
import java.util.LinkedList;

public class IntroLinkedList
{

	public static void main(String[] args)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(11));
		list.add(new Integer(23));
		list.add(new Integer(14));
		list.add(new Integer(15));

		System.out.println("1차 참조");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		list.remove(0);
		System.out.println("2차 참조");
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
