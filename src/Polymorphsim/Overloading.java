package Polymorphsim;

public class Overloading {
	
	void a(int a)
	{
		System.out.println("int "+a);
	}
	void a(char a)
	{
		System.out.println("char "+a);
	}
	void a(float a)
	{
		System.out.println("float "+ a);
	}
	void a(double a)
	{
		System.out.println("double" +a);
	}
	void a(String a)
	{
		System.out.println("String  " +a);
	}
	void a(short a)
	{
		System.out.println("short" +a);
	}
	void a(long a)
	{
		System.out.println("long" +a);
	}
	void a(boolean a)
	{
		System.out.println("boolean" +a);
	}
	void a(byte a)
	{
		System.out.println("byte" +a);
	}

	public static void main(String[] args) {
		Overloading s=new Overloading();
		//short a=755;
		   s.a(true);
	}

}
