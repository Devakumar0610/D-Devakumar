package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList o = new ArrayList();
		   o.add(5+6);
		   o.add(6);
		   o.add(7);
		   o.add(7);
		   o.add(0);
		   o.add("paul");
		   o.add('p');
		   o.add(3.4567);
		   o.add(true);
//		   Integer o1 =10;
           System.out.println(o);
//		   System.out.println(o1);
		   
		   HashSet k=new HashSet(o) ;
		   System.out.println(k);
		
		   LinkedList n= new LinkedList();
		     n.add(1);
		     n.add(2);
		     n.add(3);
		     n.add(0);
		     System.out.println(n); 

	}

}
