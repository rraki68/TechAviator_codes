package prog15;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;

public class prog15 {

	public static void main(String[] args) {
		int j =0;
		int [] a = {0,1,2,3};
         int b = a.length;
         
         int ln = a[0];
         int sn =a[0];
		for(int i=0;i<b;i++)
		{
			if(a[i]> ln)
			{
				ln = a[i];
			}
				else if(a[i]< sn)
				{
					sn = a[i];
			}
		}
		
		System.out.println( "largest no is "+ ln);
		System.out.println("smallest no is "+ sn);
		
		
	}
	
	
	

}
