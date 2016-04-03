package prog11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class prog11 {

		public void expenditure_calc()
		
		{
			Scanner fip = new Scanner(System.in);
			System.out.println("Enter the amout spent last month on the following items : ");
			System.out.println("Food : ");
			double foodexp= fip.nextDouble();
			
			Scanner cip= new Scanner(System.in);
			System.out.println("Clothing : ");
			double cloexp = cip.nextDouble();
			
			Scanner eip= new Scanner(System.in);
			System.out.println("Entertainment : ");
			double entexp = eip.nextDouble();
			
			Scanner rip= new Scanner(System.in);
			System.out.println("Rent : ");
			double renexp = rip.nextDouble();
					
			double total = foodexp+cloexp+entexp+renexp;
			
			// percentage calculator for food
			double fexp = ((foodexp/total)*100);
			
			// percentage calculator for cloths
			double cexp = ((cloexp/total)*100);
			
			// percentage calculator for entertainment
			double eexp = ((entexp/total)*100);
			
			// percentage calculator for entertainment
			double rexp = ((renexp/total)*100);
			//DecimalFormat d = new DecimalFormat("##.##");
			
			System.out.println("  CATEGORY                   Budget Spent    ");
			System.out.println(" ===========                ==============    ");
			System.out.println("  Food                        "+Math.round(fexp*100.0)/100.0+" $");
			System.out.println("  Clothing                    "+Math.round(cexp*100.0)/100.0+" $");
			System.out.println("  Entertainment               "+Math.round(eexp*100.0)/100.0+" $");
			System.out.println("  Rent                        "+Math.round(rexp*100.0)/100.0+" $");
			
		}

	}