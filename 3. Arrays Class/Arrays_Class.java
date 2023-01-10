package utilityClass;

import java.util.Arrays;

public class Arrays_Class 
{

	public static void main(String[] args) 
	{
		int[] a = {5,10,8,7,13};
		System.out.println("Before Sort");
		for(int no:a)
		{
			System.out.print(no + " ");
		}
		
		System.out.println();
		Arrays.sort(a);
		
		//for each loop
		System.out.println("After Sort");
		for(int no:a)
		{
			System.out.print(no +" ");
		}

		
		System.out.println();
		System.out.println();
		
		
		
		
		System.out.println("Before Sort");
		
		String[] s = {"a","ab","abc","c","b","cb","bca"};
		for(String no:s)
		{
			System.out.print(no + " ");
		}
		System.out.println();
		Arrays.sort(s);
		
		//for each loop
		System.out.println("After Sort");
		for(String no:s)
		{
			System.out.print(no +" ");
		}
		
		
		
	}

}

/*

output:-

Before Sort
5 10 8 7 13 
After Sort
5 7 8 10 13 

Before Sort
a ab abc c b cb bca 
After Sort
a ab abc b bca c cb 


*/ 
