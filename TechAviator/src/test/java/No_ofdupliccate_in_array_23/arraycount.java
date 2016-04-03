package No_ofdupliccate_in_array_23;

public class arraycount {
 static int temp =0;
	public static void main(String[] args) {
		int[] a = {1,2,3,9,12,9,3,9};
		
		for(int i=0;i<a.length;i++){
			if (a[i]==9)
			{
				temp =temp+1;
			}
		}
      System.out.println("9 occurs "+temp+" times");
	}

}
