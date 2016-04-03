package prog13;
import java.util.Scanner;

public class prog13 {

	private String name;
	private int maths;
	private int english;
	private int science;
	
	
	public prog13() {
		Scanner studname = new Scanner(System.in);
		System.out.println("Enter The student name ");
		String stuip= studname.nextLine();
		name = stuip;
		
		Scanner eng = new Scanner(System.in);
		System.out.println("Enter English marks : ");
		int eip= eng.nextInt();
		english = eip;
		
		Scanner math = new Scanner(System.in);
		System.out.println("Enter Maths marks : ");
		int mip= math.nextInt();
		maths = mip;
		
		Scanner sci = new Scanner(System.in);
		System.out.println("Enter Science marks : ");
		int sip= sci.nextInt();
		science = sip;
		
		System.out.println();

	}
	
	public String getname(){
		
		return name;
	}

	public int  getenglish_marks(){
		return english;
	}
	
	public int  getmath_marks(){
		return maths;
	}
	
	public int  getscience_marks(){
		return science;
	}
	
}
