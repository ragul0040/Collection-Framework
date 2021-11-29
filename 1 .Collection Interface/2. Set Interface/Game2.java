package collectionInterface;

import java.util.ArrayList;

public class Game2 
{

	public static void main(String[] args) 
	{
		Game2 g1 = new Game2();
		Game2 g2 = new Game2();
		
		
		ArrayList al = new ArrayList();
		al.add(g1);
		al.add(g2);
		System.out.println(al);
		
	}

	
//toString method Override
	public String toString()
	{
	 return "Hi";
	}

}

/*

output:-

[Hi, Hi]

*/
