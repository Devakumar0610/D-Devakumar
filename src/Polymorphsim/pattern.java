package Polymorphsim;

public class pattern {
	
	void display()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(i);
		}
	}
	
	void count()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	int a=0;
	void recuration()
	{
		a++;
		System.out.println(a);
	if(a<5)
	{
		recuration();
	}
	}
	public static void main(String[] args) {
		pattern p=new pattern();
		p.display();
		
		
		p.count();
		
	
		p.recuration();

	}

}
