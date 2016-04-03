package age_hashmap_17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class prog17_call {
public static int i;
	public static void main(String[] args) {
		
		
		 Map<String, prog17> map = new LinkedHashMap<String, prog17>();
		 
		 // adding three values to map
		 prog17 a = new prog17();
		 a.setage(12); a.setname("arun");
		 map.put("arun",a);

		 prog17 b = new prog17();
		 b.setage(15); b.setname("raj");
		 map.put("raj",b);
		 
		 prog17 d = new prog17();
		 d.setage(45); d.setname("suresh");
		 map.put("suresh",d);
		 
		 prog17 c = map.get("raj");
		 System.out.println("given map's key value is :");
		 System.out.println(c.getage());
		 System.out.println(c.getname());
		 
		 // removing data from map
		 map.remove("arun");
		 System.out.println();
		 
		 
		 // iterating map
		 System.out.println("current values in map :");
		 for (Map.Entry<String, prog17> entry : map.entrySet()) {
			  String key = entry.getKey();
			  System.out.println(key +"   ");
			  i = i+1;
			}
		 
	System.out.println("Total values in map "+i);	 
	}

}
