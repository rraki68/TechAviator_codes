package sumof_array16;

import java.util.Arrays;

public class prog16 {
static int temp;
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++){
			 temp= temp+a[i];
			System.out.println(a[i]);
		}
		System.out.println(temp);
	}

}
