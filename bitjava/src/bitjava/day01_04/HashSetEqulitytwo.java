package bitjava.day01_04;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEqulitytwo
{

	public static void main(String[] args)
	{
		HashSet<SimpleNumber> hset = new HashSet<SimpleNumber>();
		hset.add(new SimpleNumber(5));
		hset.add(new SimpleNumber(15));
		hset.add(new SimpleNumber(64));
		hset.add(new SimpleNumber(24));
		hset.add(new SimpleNumber(3));
		hset.add(new SimpleNumber(64));

		System.out.println("저장된 데이터 크기 : "+hset.size());
		
		Iterator<SimpleNumber> itr = hset.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());

		}
	}

}

