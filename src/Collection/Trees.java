package Collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Trees {

	public static void main(String[] args) {
//		Object a[] = {'a','b',1,2};
//		for(Object ch:a)
//		System.out.println(ch);
		
//		ArrayList o=new ArrayList();
//		     
//		   o.add(10);
//		   o.add(20);
//		   o.add(30);
//		   o.add("DEvakumar");
//		   o.add('m');
//		   o.add(true);
//           System.out.println(o);
		
//       TreeSet s=new TreeSet();
//        s.add(5);
//        s.add(1);
//        s.add(2);
//        s.add(5);
//        s.add(9);
//        s.add(8);
//        System.out.println(s);
		
		
		ArrayList<Integer> marks = new ArrayList<Integer>(); 
		 marks.add(10); 
		 //marks.add("manikandan");
		 Scanner sc = new Scanner(System.in); 
		 System.out.println("Press 'y' to continue");
		 String input = sc.next(); 
		 while(input.equals("y"))
		 {
		  System.out.println("Enter Mark");
		  int mark = sc.nextInt(); 
		  marks.add(mark); 
		  System.out.println("Press 'y' to continue");
		  input = sc.next(); 
		  
		 }
		 for(Integer mark:marks)
		System.out.println(marks);
		
		
		
		
       
	}

}
