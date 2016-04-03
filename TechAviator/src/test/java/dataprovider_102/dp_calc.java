package dataprovider_102;

import org.testng.annotations.DataProvider;

public class dp_calc {

	//below line is to declare the name of dataprovider n the same name will be used in the calling class
	@DataProvider (name="values")
	
public static Object[][] twodimarray()
	{
	
	// below object word is the datatype of the array bcoz it can accept any datatype  
	// below 2d array acts like 3*2 matrix	
		Object[][] data =	new Object [1][2];
	
		data[0][0] = 1; 
		data[0][1] = 2;
		
		/*data[1][0] = 3;
		data[1][1] = 4;
		
		data[2][0] = 5;
		data[2][1] = 6;*/
		
		return data;
}

}
