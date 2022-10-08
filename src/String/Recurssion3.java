package String;

public class Recurssion3 {
	void m1(int n)
	{
		System.out.println(n);
		n++;
	if(n<=5)
	{
		m1(n);
	}
	System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recurssion3 s=new Recurssion3();
		s.m1(1);
	}

}
