package parrottalk_21;

public class class2 {
boolean ret;
	 boolean parrottalk(boolean val, int hour)
	{
		if(val==true){
		if(hour < 7 || hour>20)
		{
			ret = true;
		}
		
	}
		else{ 
			ret= false;
			}
		return ret;	
		
	}
}
