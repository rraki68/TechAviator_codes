package prog10;

public class prog10callclass {

	public static void main(String[] args) {
		
			int i, j,num;
			num =8;
			for(i=1;i<=num;i++)
			{
			for(j=1;j<=num;j++)
			{
			if((i+j)>num )
			{
			System.out.print("*");
			System.out.print(" ");
			}

			else
			{
			System.out.print(" ");
			}
			}
			System.out.println();
			}
		}
			

	}


