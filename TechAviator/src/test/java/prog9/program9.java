package prog9;

import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class program9 {

	public void password() {
		
		String pwd1 = "test" ;
		
        
        for (int i=0; i< 3; i++)
        {
        	Scanner inp = new Scanner(System.in);
		    System.out.println("Enter the Password");
	        String pwd = inp.nextLine();
        	
        	if (pwd.equals(pwd1)){
        		System.out.println("Welcome  "+pwd);
        		break;
        	}
        	else if(i==2){
        		System.out.println( "ACCESS DENIED ");
        	}
        	else {System.out.println("The Password you entered is incorrect ");}
        }
	}

}
