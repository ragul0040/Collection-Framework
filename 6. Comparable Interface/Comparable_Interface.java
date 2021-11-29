package utilityClass;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Interface implements Comparable
{

	public static void main(String[] args) 
	{
		Comparable_Interface c1 = new Comparable_Interface(1);
		Comparable_Interface c2 = new Comparable_Interface(5);
		Comparable_Interface c3 = new Comparable_Interface(2);
		Comparable_Interface c4 = new Comparable_Interface(4);
		Comparable_Interface c5 = new Comparable_Interface(3);
		
		
		ArrayList al2 = new ArrayList();
		al2.add(c1);
		al2.add(c2);
		al2.add(c3);
		al2.add(c4);
		al2.add(c5);

		System.out.println("Before Sort");
		System.out.println(al2);
		Collections.sort(al2);
		System.out.println("After Sort");
		System.out.println(al2);
		
	}
	
	
	
	int i;
	public Comparable_Interface (int i)
	{
		this.i=i;
	}
	
	
	
	public String toString()
	{
		return this.i + " ";
	}

	@Override
	public int compareTo(Object o) 
	{
		Comparable_Interface c =(Comparable_Interface)o;
		if(this.i>c.i)
			return-1;
		else if(this.i<c.i)
			return +1;
		return 0;
		
	}

}


/*

Before Sort
[1 , 5 , 2 , 4 , 3 ]
After Sort
[5 , 4 , 3 , 2 , 1 ]


*/
