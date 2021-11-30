package collectionInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash_Map2 
{

	public static void main(String[] args) 
	{
		HashMap hm = new HashMap();
		hm.put("nellai", 1);
		hm.put("pandian", 2);
		hm.put("kanyakumari", 3);
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.values());
		
		Set s = hm.entrySet();
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}

	}

}

/*

[pandian, kanyakumari, nellai]
[pandian=2, kanyakumari=3, nellai=1]
[2, 3, 1]
pandian
2
kanyakumari
3
nellai
1
*/
