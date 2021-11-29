package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Game3 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(5);
		System.out.println(al);
//to sort Collection	
		Collections.sort(al);
		System.out.println(al);
		
		
		

		Game3 g1 = new Game3();
		Game3 g2 = new Game3();
		ArrayList al1 = new ArrayList();
		al1.add(g1);
		al1.add(g2);
		System.out.println(al1);
		
		Collections.sort(al1);
		System.out.println(al1);
		
		

	}	
	
}

/*
 
output:-

[10, 5]
[5, 10]
[collectionInterface.Game3@3764951d, collectionInterface.Game3@4b1210ee]
Exception in thread "main" java.lang.ClassCastException:

*/
