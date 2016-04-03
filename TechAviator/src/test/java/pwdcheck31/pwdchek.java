package pwdcheck31;

import java.util.Scanner;

public class pwdchek {

	public static void main(String[] args) {
		
		System.out.println(" WELCOME TO HFC BANK");
		int pin = 1234;
		
		for(int i=1;i<4;i++)
		{
			System.out.println(" Enter the pin");
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
		
			if(b==pin)
			{
				System.out.println("PIN ACCEPTED, YOU HAVE LOGGED IN SUCCESSFULLY");
				break;
			}
			else if(i==3){
				System.out.println(" YOU HAVE RUN OUT OF TRIALS, ACCESS LOCKED");
				}
			else {System.out.println("INCORRECT PIN");}
		}

	}

}
