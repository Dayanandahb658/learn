package Projectsell;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class BasicRest 


{
	@Test(dataProvider = "Sample2")
   public void Sample1(String i)
   {
	   char[][][] s = null;
	System.out.println(s[0] [1]);
	   
   }
	@DataProvider
	public String[][] Sample2()
	{
          String[][] data=new String[][] 
        		  {
        	  {"a","1"},
        	  {"b","2"},		
        	  {"c","3"},		
        				
        		  };
          return data;
	}
	
}
