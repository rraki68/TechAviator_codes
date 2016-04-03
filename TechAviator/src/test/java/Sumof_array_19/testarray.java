package Sumof_array_19;

public class testarray {
 int m =0;
 public static  int sum =0;
		 
	public static void main(String[] args) {
		
		int[] no ={1,2,3,4};
		
		for (int i=0;i<no.length;i++)
		{
			sum = sum+no[i];
			
		}
		System.out.println(sum);
	}

}
