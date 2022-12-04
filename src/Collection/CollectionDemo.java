package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
	
	public static void main(String[] args) 
	{
		CollectionDemo cd=new CollectionDemo();
		cd.learn_list();
	}
	
	private void learn_list() {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(5);
		al.add(20);
		al.add(1234);
		al.add('c');
		al.add("Deva");
		System.out.println(al);
	
		
		Mobiles m1 =new Mobiles();
		CollectionDemo cd=new CollectionDemo();
		
		al.add(cd);
		al.add(m1);
		
		System.out.println(al);
			
	

		
		ArrayList al2=new ArrayList();
		System.out.println(al2);
		al2.add("idly");
		al2.add("dosai");
		al2.add(1,"pongal");
		al2.remove("idly");
     	System.out.println(al2);
		//al2.remove(0);
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		al2.addAll(1,al);
		System.out.println(al2);
		System.out.println(al2.get(0)); 
		System.out.println(al2.remove(0));
		al2.clear();
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		al2.retainAll(al);
		System.out.println(al2);
		System.out.println(al2.contains("idly"));
		
		int[] ar1= {10,20,30,40,50};
		int[] ar2= {30,40,50};
		
		
		
		
		List<int[]> al1 = Arrays.asList(ar1);
		List<int[]> al21 = Arrays.asList(ar2);
		System.out.println(containsAll(al1));
		
//		List al3 = al2.subList(3, 5)
//	    System.out.println(al3);
		
		
		
	}



	private char[] containsAll(List<int[]> al1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}


