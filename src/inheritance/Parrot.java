package inheritance;

public class Parrot extends Bird{
	int a=5;
	void speak()
	{
		int a=4;
     	System.out.println("Hello");
     	// System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		Parrot p=new Parrot();
		   p.speak();
	       p.fly();
	      
	}
} 
