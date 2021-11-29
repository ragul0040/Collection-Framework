package utilityClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Interface 
{
	int i;
	public Comparator_Interface(int i)
	{
		this.i=i;
	}
	public static void main(String[] args) 
	{
	  
		Comparator_Interface c1=new Comparator_Interface(10);
		Comparator_Interface c2=new Comparator_Interface(200);
		Comparator_Interface c3=new Comparator_Interface(30);
		Comparator_Interface c4=new Comparator_Interface(40);
		Comparator_Interface c5=new Comparator_Interface(50);
		ArrayList al = new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		al.add(c5);
		
		Comparator_Interface_2 z =new Comparator_Interface_2();
		System.out.println(al);
		Collections.sort(al,z);
		System.out.println(al);
	
	}


	
	public String toString()
	{
		return this.i+" ";
	}


}


/*

output:-

[10 , 200 , 30 , 40 , 50 ]
[10 , 30 , 40 , 50 , 200 ]

*/
