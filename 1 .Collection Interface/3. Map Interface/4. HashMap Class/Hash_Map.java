package collectionInterface;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("tamil", 10);
		hm.put("english", 10);
		hm.put("maths", 2);
		hm.put("science", 2);
		hm.put("social", 2);
		
		System.out.println(hm);//map
		System.out.println(hm.entrySet());//entry
		System.out.println();
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println();
		Set s1 = hm.entrySet();
		Iterator i = s1.iterator();
	/*	
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	*/
	
		/*
		while(i.hasNext())
		{
		Object o = i.next();
		Map.Entry entry = (Map.Entry)o;
		
		System.out.println(entry.getKey()+ " ---> "+entry.getValue());
        
		}
		*/
		
		while(i.hasNext())
		{
			Object o = i.next();
			Map.Entry entry = (Map.Entry)o;
			Object O2 = entry.getKey();
			
			String s = (String)O2;
			
			if(s.equals("tamil"))
			{
				System.out.println(entry.getValue());
				
			}
		
        
		}
		
	}

}


/*

{tamil=10, social=2, maths=2, science=2, english=10}
[tamil=10, social=2, maths=2, science=2, english=10]

[tamil, social, maths, science, english]
[10, 2, 2, 2, 10]

10

*/
