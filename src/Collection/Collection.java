package Collection;

import java.util.HashMap;

public class Collection {

	public static void main(String[] args) {
		
			 
			 CollectionDemo cd = new CollectionDemo();
			   //     cd.learn_Map();
			 
	}
			 private void learn_Map() {
				 
				 HashMap menu = new HashMap();
				 menu.put("Vadai", 10);
				 menu.put("Idli", 20);
				 menu.put("Pongal", 30);
				 menu.put("Dosai", 40);
				 menu.put("Vadai", 8);
				 System.out.println(menu);
				 System.out.println(menu.containsKey("Dosai")); 
				 System.out.println(menu.containsValue(8)); 
				 System.out.println(menu.keySet());
				 System.out.println(menu.values());
				 System.out.println(menu.entrySet());
				 
				 
				}

			

	}


