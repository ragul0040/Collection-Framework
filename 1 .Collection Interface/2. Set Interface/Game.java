package collectionInterface;

public class Game
{

	public static void main(String[] args)
	{
		Game g1 = new Game();
		Game g2 = new Game();
		System.out.println(g1.equals(g2));
		
	}

//Object Class   hashCode(method)   override possible 
	public boolean equals(Object O1)   //to pass object (g2)
	{
		
	
		int h1=this.hashCode();
		Game g3 =(Game)O1;   //type casting
		int h2=g3.hashCode();
		
		if(h1==h2)
			return true;
		else
		    return false;
		
	}
	
	public int hashCode()
	{
		return 1;
	}
	
}


/*

output:-

true

*/
