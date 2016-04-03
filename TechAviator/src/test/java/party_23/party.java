package party_23;

public class party {

	public static void main(String[] args) {
		
		int a =teaparty(2, 8);
		
		if (a==1){System.out.println("Good");}
		else if(a==0){System.out.println("Bad");} 
		else if(a==2){System.out.println("Geat");} 
		
	}

	
	public static int teaparty(int t, int c)
	{
		int ret = 0;
		if(c==5 && t == 5){ret= 1;}
		else if(t*t>=c*c || c*c>=t*t){ret= 2;}
		else if (c<5 || t< 5){ret= 0;} {
			
		}
		return ret;
		
	}
	
	
}
