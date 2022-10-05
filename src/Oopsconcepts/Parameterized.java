package Oopsconcepts;

public class Parameterized 
    {
	void print(int k)
	{
		System.out.println(k);
	}
	
	public static void main(String[] args) 
	{
		Parameterized p = new Parameterized();
		       p.print(5);
		       p.print(6);
	}

}
