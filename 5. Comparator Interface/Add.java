package utilityClass;

import java.util.ArrayList;
import java.util.Collections;


public class Add 
{
int i;
	public Add(int i) 
	{
		this.i=i;
		
	}
	public String toString()
	{
		return this.i + " ";
	}


	public static void main(String[] args) 
	{
		
		Add a1=new Add(10);
		Add a2=new Add(5);
		Add a3=new Add(7);
		Add a4=new Add(3);
		Add a5=new Add(2);
		ArrayList al = new ArrayList();
		al.add(a1);
		al.add(a2);
		al.add(a3);
		al.add(a4);
		al.add(a5);
		
		System.out.println(al);
		
		
		Add2 z= new Add2();
		Collections.sort(al,z);
		System.out.println(al);

	}

}

/*

[10 , 5 , 7 , 3 , 2 ]
[2 , 3 , 5 , 7 , 10 ]

*/
