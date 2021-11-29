package utilityClass;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Class 
{
	
	
	public static void main(String[] args) 
	{
	
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(4);
		al.add(20);
		al.add(3);
		al.add(14);
		
		System.out.println("Before Sort");
		System.out.println(al);
		System.out.println();
		
		System.out.println("After Sort");
		Collections.sort(al);
		System.out.println(al);
		
		System.out.println("Minimum   "+Collections.min(al));
		System.out.println("Maximum   "+Collections.max(al));
		
		
	}

}


/*

Before Sort
[10, 4, 20, 3, 14]

After Sort
[3, 4, 10, 14, 20]
Minimum   3
Maximum   20


*/
