package utilityClass;


import java.util.Comparator;

public class Comparator_Interface_2 implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1)
	{
		
		Comparator_Interface c1=(Comparator_Interface)arg0;
		Comparator_Interface c2=(Comparator_Interface)arg1;
		if(c1.i>c2.i)
			return +1;
		else if(c1.i<c2.i)
			return -1;
		return 0;
	}

}

/*

output:-

[10 , 200 , 30 , 40 , 50 ]
[10 , 30 , 40 , 50 , 200 ]

*/
