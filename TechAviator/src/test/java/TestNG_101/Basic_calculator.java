package TestNG_101;

import org.testng.annotations.Test;

public class Basic_calculator 
{
  
	@Test
  public void addition()
	{
		int a= 1;
		int b= 2;
		int c= a+b;
		System.out.println(c);
  }
	
	@Test
	  public void mul()
		{
			int a= 1;
			int b= 2;
			int c= a*b;
			System.out.println(c);
	  }
	
	@Test
	  public void sub()
		{
			int a= 1;
			int b= 2;
			int c= a-b;
			System.out.println(c);
	  }
	
	
}
