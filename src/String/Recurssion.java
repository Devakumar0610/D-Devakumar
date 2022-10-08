package String;

public class Recurssion {
	int n=2;
	void m1()
	{
		System.out.println(n);
		n+=2;
		if(n<=10)
		{
			m1();
		}
	}

	public static void main(String[] args) {
		Recurssion s=new Recurssion();
		s.m1();
		// TODO Auto-generated method stub
		

	}

}
