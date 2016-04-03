package tripetscheck_32;

public class tripletscheck {
	static int temp = 0; 
	public static void main(String[] args) {
		 
		int[] a = {1,2,3,4,5,5,5,6,7};
		
		for (int i=0;i<a.length-2;i++)
		{
			for (int j = i; j <= i+2; j++) 
			{
				if (a[i]==a[j])
				{
					temp = temp+1;
					if (temp==3)
					{
						System.out.println( "Triplet no is "+ a[j]);
						temp =0;
						break;
					}
					
				}
				else {temp = 0;}
				/*if(i== a.length-2){ System.out.println("done");
				break;
				} */
			}
			
		}
		
	}

}
