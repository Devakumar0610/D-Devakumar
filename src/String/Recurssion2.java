package String;

public class Recurssion2 {
	 int n=2;
	 void m1()
	 {
		 System.out.println(n);
		 n++;
	 if(n<=5)
	 {
		 m1();
	 }
		 System.out.println(n);
	 }

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Recurssion2 s=new Recurssion2();
				 s.m1();
	}

}
