package switchcase_26;

import java.util.Scanner;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class org26 {

	public static void main(String[] args) {


		Scanner a= new Scanner(System.in);
		System.out.println("Enter the age");
		int age = a.nextInt();
		int cas = 0;
		
		if(age <16)
		{
			cas = 1;
		}
		else if(age >16 && age<20)
		{
			cas= 2;
		}
		else if(age >20 && age<25)
		{
			cas= 3;
		}
		else if(age >25)
		{
			cas= 4;
		}
		
		
		
		switch (cas) {
		case 1:
			System.out.println("you cannot drive");
			break;
			
		case 2:
			System.out.println("you cannot vote");
			break;
			
		case 3:
			System.out.println("you cannot rent a car");
			break;
		case 4:
			System.out.println("You can do anything legal");
			break;
			
		
		}
		
		
		
			
						
			
			
			
	}

}
