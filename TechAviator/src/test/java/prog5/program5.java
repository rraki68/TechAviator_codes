package prog5;

import java.util.Scanner;

public class program5 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of the grade in integer");
        int a = ip.nextInt();
        
        if (a>50 &&a< 90){
        	int x =1;
         //System.out.println(" Great job your grade is "+ a);
        }
       
        else if (a>90 && a<100){
        	int x =3;
        	/*a=a+2;
        	System.out.println( "Added + 2 for the Grade = "+a );*/
        }
        else if (a<20 || a > 50){
        	//System.out.println("Error : given grate is less than 50"); }
        	int x =3;
	}
	}

}
