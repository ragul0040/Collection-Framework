package collectionInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Map3 
{

	public static void main(String[] args) 
	{
		Set ss = new HashSet();
		ss.add(5);
		ss.add(10);
		ss.add(20);
		ss.add(33);
		System.out.println(ss);
		
		
		
		Iterator i = ss.iterator();
		
		/*
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		*/
		
		while(i.hasNext())
		{
			Object q = i.next();
			Integer a =(Integer)q;
			
			if(a%3==0)
			{
				System.out.println("true " + a);
			}
			
		}
				

	}

}

/*

[33, 20, 5, 10]
true 33

*/
