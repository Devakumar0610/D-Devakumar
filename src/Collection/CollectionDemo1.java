package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		CollectionDemo1 cd = new CollectionDemo1();
		    //cd.learn_Map();
		    //cd.duplicate_Values1();
		    //cd.array_demo();
		    //cd.logicproblem();
		cd.learn_interfaces();

	}

private void learn_interfaces() {
		
	ArrayList al =new ArrayList();
		Mobiles m1 = new Mobiles("Apple",15000); 
		Mobiles m2 = new Mobiles("Vivo",18000); 
		Mobiles m3 = new Mobiles("Oppo",45000);
		
		
		
		
		al.add(m1);
		al.add(m2);
		al.add(m3);
	}

private void logicproblem() {
	
		 // TODO Auto-generated method stub
		 ArrayList al = new ArrayList(); 
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 
		for(Object o: al)
		{
		 Integer i = (Integer)o; 
		 if(i%20==0)
		 System.out.println(o);
		}
		
	}

//	private void array_demo() {
//		// TODO Auto-generated method stub
//	 int[] a= {10,20,30,40,40,50,10};
//	
//		
//		LinkedHashSet<Integer>lhs = new <Integer>LinkedHashSet(); 
//	
//					
//	}

	private void duplicate_Values1() {
		ArrayList al = new ArrayList(); 
		 al.add(10);
		 al.add(20);
		 al.add(10);
		 al.add(50);
		 al.add(30); 
		 al.add(-40); 
		 al.add(-40);
		System.out.println(al);
		 //Remove Duplicates
		 //LinkedHashSet lhs = new LinkedHashSet(al);
		 //System.out.println(lhs);
		 LinkedHashSet lhs = new LinkedHashSet(al); 
		 
		
	////System.out.println(lhs);
		System.out.println(lhs);
		 for(Object o: al)
		 {
		  System.out.println(o + " Added: "+ (lhs.add(o)));
			
		  boolean added = lhs.add(o);
		  if(added==false)
		   System.out.println(o);
		 }
		System.out.println(lhs);
		 
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
