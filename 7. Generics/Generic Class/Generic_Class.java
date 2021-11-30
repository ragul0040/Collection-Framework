package generic;

public class Generic_Class <T>
{
    T obj;
	Generic_Class(T obj)
	{
		this.obj=obj;
	}
	
	public void display()
	{
		System.out.println(obj + " " + obj.getClass().getName());
	}
	

}
