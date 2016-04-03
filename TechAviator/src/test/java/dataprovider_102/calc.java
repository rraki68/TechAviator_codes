package dataprovider_102;

import org.testng.annotations.Test;

public class calc {
	
	@Test (dataProvider="values", dataProviderClass=dp_calc.class,priority = 2)

	  public void addition(int val1,int val2)
		{
			
			int c= val1+val2;
			System.out.println(c);
	  }
		
	@Test (dataProvider="values", dataProviderClass=dp_calc.class,priority=1)

		  public void mul(int val1,int val2)
			{
				
				int c= val1*val2;
				System.out.println(c);
		  }
		
	@Test (dataProvider="values", dataProviderClass=dp_calc.class,priority= 3,enabled=false)

		  public void sub(int val1,int val2)
			{
				
				int c= val1-val2;
				System.out.println(c);
		  }
		
}
