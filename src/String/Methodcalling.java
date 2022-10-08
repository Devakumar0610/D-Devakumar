package String;

public class Methodcalling {
	 int n=1;
	 void m1()
	 {
		 System.out.println(n);
		 n++;
		 m2();
	 
	 System.out.println("Hello world");
}
	 void m2()
	 {
	  System.out.println(n);
	  n++;
	  m3();
	 }
	 void m3()
	 {
		 System.out.println(n);
		 n++;
		 m4();
	 }
	 void m4()
	 {
		 System.out.println(n);
		 n++;
	 }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
     Methodcalling a=new Methodcalling();
     a.m1();
	}

}
