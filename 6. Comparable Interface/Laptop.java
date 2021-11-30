package collectionsClass_17_11_2021;

import java.util.ArrayList;
import java.util.Collections;

public class Laptop implements Comparable
{
	static String string;
	int i;
	int j;

	public Laptop(String string, int i, int j) 
	{
		this.string=string;
		this.i=i;
		this.j=j;
	}

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		Laptop l1 = new Laptop("Dell",4,40000);
		Laptop l2 = new Laptop("Sony",8,45000);
		Laptop l3 = new Laptop("HP",16,42000);
		Laptop l4 = new Laptop("Acer",8,30000);
		Laptop l5 = new Laptop("Lenovo",4,41000);
		Laptop l6 = new Laptop("Lenovo",12,43000);
		
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		al.add(l5);
		al.add(l6);
		
		System.out.println(al);

		
		Collections.sort(al);
		System.out.println(al);
	}
	
	public String toString()
	   {
		return  this.i+" RAM   " + this.j+" Price   " +  this.string+" Brand   " ;
	   }
/*
	@Override
	public int compareTo(Object o) 
	{
		return i;
	
	}

*/
	
	// Price Wise Sort
	@Override
	public int compareTo(Object o)
	{
	
	//Descending order
		Laptop l = (Laptop)o;
		if(this.j>l.j)
			return -1;
		else if(this.j<l.j)
		   return +1;
		return 0;
		
	/*
	//Ascending Order
		Laptop l = (Laptop)o;
		if(this.j>l.j)
			return +1;
		else if(this.j<l.j)
		   return -1;
		return 0;
		*/
	}
   
	
	/*
	//RAM wise sort
	@Override
	public int compareTo(Object o)
	{
	//Descending Order
		Laptop l = (Laptop)o;
		if(this.i>l.i)
			return -1;
		else if(this.i<l.i)
		   return +1;
		return 0;

	//Ascending Order
   
		Laptop l = (Laptop)o;
		if(this.i>l.i)
			return +1;
		else if(this.i<l.i)
		   return -1;
		return 0;
	}
    */

}
