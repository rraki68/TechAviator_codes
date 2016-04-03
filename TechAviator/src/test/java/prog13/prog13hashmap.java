package prog13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prog13hashmap {

	public static void main(String[] args) {
		Map<String,prg13hm> hm = new HashMap<String,prg13hm>();
		
		prg13hm phm1 = new prg13hm("raki", 11, 11, 11);	
		hm.put("raki", phm1);
		
		prg13hm phm2 = new prg13hm("hari", 22, 22, 22);	
		hm.put("hari", phm2);
		
		prg13hm phm3 = new prg13hm("raj", 33, 33, 33);	
		hm.put("raj", phm3);
		
		prg13hm phm4 = new prg13hm("arun", 44, 44, 44);	
		hm.put("arun", phm4);
		
		prg13hm phm5 = new prg13hm("rahul", 55, 55, 55);	
		hm.put("rahul", phm5);
		
		Scanner stdname = new Scanner(System.in);
		System.out.println("Enter the name of the student to get data");
		String sname = stdname.nextLine();	
		
		prg13hm object = hm.get(sname);
		
		System.out.println(object.getname());
		System.out.println(object.getenglish_marks());
		System.out.println(object.getmath_marks());
		System.out.println(object.getscience_marks());
		
		
	}

	
}
