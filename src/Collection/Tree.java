package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Tree {

	
		public static void main(String[] args) 
		{
			Tree cd=new Tree();
			cd.learn_list();
			cd.learn_LinkedHashSet();
		}
		
		private void learn_LinkedHashSet() {
			LinkedHashSet s= new LinkedHashSet();
			s.add(10);
			s.add(5);
			s.add(20);
			s.add(1234);
			s.add(1234);
			s.add('c');
			s.add("Deva");
			System.out.println(s);
						
		}

		private void learn_list() {
			HashSet al= new HashSet();
			al.add(10);
			al.add(5);
			al.add(20);
			al.add(1234);
			al.add(1234);
			al.add('c');
			al.add("Deva");
			System.out.println(al);
		
	}

}
