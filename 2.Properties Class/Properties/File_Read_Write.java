package collectionInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Read_Write 
{

	public static void main(String[] args) throws IOException
	{
	
		Properties n = new Properties();
		
		FileInputStream fi = new FileInputStream("/home/ragul/eclipse-workspace/Collection/src/collectionInterface/application.properties");
		n.load(fi);
	    
		System.out.println("username");
		System.out.println("password");
		n.setProperty("db", "oracle");
		
		
		FileOutputStream fo = new FileOutputStream("/home/ragul/eclipse-workspace/Collection/src/collectionInterface/application.properties"); 
		n.store(fo,"got");
		
	

	}

}
