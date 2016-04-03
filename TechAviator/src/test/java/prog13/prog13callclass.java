package prog13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class prog13callclass {

	public static void main(String[] args) {
		ArrayList<prog13> slist = new ArrayList<prog13>();
		Scanner studno = new Scanner(System.in);
		System.out.println("Enter the no of students ");
		int num = studno.nextInt();
		
		for(int i=0;i<num;i++){
			prog13 ai= new prog13();
			slist.add(ai);		
		}
			
		Scanner stdname = new Scanner(System.in);
		System.out.println("Enter the name of the student to get data");
		String sname = stdname.nextLine();	
		
	    for(int i=0;i<slist.size();i++){
	    	if(slist.get(i).getname().equals(sname)){
	    		System.out.println("Details ");
	    		System.out.println("========");
	    		System.out.println(slist.get(i).getname());
	    		System.out.println(slist.get(i).getenglish_marks());
	    		System.out.println(slist.get(i).getmath_marks());
	    		System.out.println(slist.get(i).getscience_marks());
	    		
	    	}
	    }
	
	}
		
	
	}



/*Iterator<prog13> iterator = slist.iterator();
while(iterator.hasNext()){
	prog13 next = iterator.next();
		String getname = next.getname();
	System.out.println(getname);*/

