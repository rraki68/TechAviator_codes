package prog7;

import java.util.Scanner;

public class program7 {

	double bc;
	double fc;
	double sc;
	double NoofBurger;
	
	public program7(){
		bc = 1.69;
		fc = 1.09;
		sc = 0.99;
	}
	public double burger_cost(double NoofBurger,double NoofFries,double Noofsodas) {
			
		double btc = bc*NoofBurger;
		double ftc = fc*NoofFries;
		double stc = sc*NoofBurger;
		double tc = btc+ftc+stc;
		System.out.println();
		System.out.println("Total cost before Tax : $"+ (double)Math.round(tc*100)/100);
		double taxc = (tc*6.5)/100;
		System.out.println("Tax : $"+(double)Math.round(taxc*100)/100);
		double ttax = tc+taxc ;
		System.out.println("Final cost : $" +(double)Math.round(ttax*100)/100);
		
		Scanner change = new Scanner(System.in);
		System.out.println("Enter the amount given :");
		double c= change.nextDouble()- ttax ;
		System.out.println( "Change : $"+(double)Math.round(c*100)/100);
	    return 0;
	}

}
