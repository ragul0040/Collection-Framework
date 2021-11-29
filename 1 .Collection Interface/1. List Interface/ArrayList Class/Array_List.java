package collectionInterface;

import java.util.ArrayList;

public class Array_List 
{

	public static void main(String[] args) 
	{
		
		ArrayList al = new ArrayList();

//1. add(E e)
		System.out.println("1.-----------Add element");
		al.add(1);
		al.add(2);
		System.out.println(al);
		
	
//2.add(int index, E element)
		System.out.println("2.---------Add element index based");
		al.add(2, 3);
		System.out.println(al);
		
		
//3.contains(Object o)
		System.out.println("3.---------Element present or not");
		System.out.println(al.contains(7));
		
		
//4.indexOf(Object o)
		System.out.println("4.--------return no index");
		System.out.println(al.indexOf(3));
		
//5.get(int index)
		System.out.println("5.--------return index no");
		System.out.println(al.get(1));
		
	
//6.isEmpty()
		System.out.println("6.--------Object empty or not");
		System.out.println(al.isEmpty());
		
//7.remove(int index)
		System.out.println("7.---------remove index element");
		System.out.println(al.remove(0));
		System.out.println(al);
		
//8.clear()
		System.out.println("8.---------clear all element");
        //al.clear();
		System.out.println(al);
		
//9.addAll(Collection<? extends E> c)
		ArrayList al2 = new ArrayList();
		System.out.println("9.-------copy all element to another element");
		al2.addAll(al);
		System.out.println(al2);
		al2.add(9);
		al2.add(3);
		System.out.println(al2);
		
//10.removeAll(Collection<?> c)
		System.out.println("10.-------remove add element in added element");
		al2.removeAll(al);
		System.out.println(al2);
		

	}

}


/*
output:- 

1.-----------Add element
[1, 2]
2.---------Add element index based
[1, 2, 3]
3.---------Element present or not
false
4.--------return no index
2
5.--------return index no
2
6.--------Object empty or not
false
7.---------remove index element
1
[2, 3]
8.---------clear all element
[2, 3]
9.-------copy all element to another element
[2, 3]
[2, 3, 9, 3]
10.-------remove add element in added element
[9]


*/
