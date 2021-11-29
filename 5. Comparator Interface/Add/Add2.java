package utilityClass;

import java.util.Comparator;

public class Add2 implements Comparator
 {

	public static void main(String[] args) 
	{
		

	}

	@Override
	public int compare(Object arg0, Object arg1) 
	{
		Add a1 = (Add)arg0;
		Add a2 = (Add)arg1;
		
		if(a1.i>a2.i)
			return +1;
		else if(a1.i<a2.i)
			return -1;
		
		return 0;
	}

}
