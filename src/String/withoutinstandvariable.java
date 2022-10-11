package String;

public class withoutinstandvariable {
	void m1(int n)
	{
		System.out.println(n);
		n++;
	if(n<=5)
	{
		m1(n);
	}
	}

	public static void main(String[] args) {
	withoutinstandvariable s=new withoutinstandvariable();
			s.m1(1);
		
	}

}
