package inheritance;

public class Son extends Father 
     {
	int n=25;
	void main()
	{
		System.out.println("Devakumar");
	}
	

	public static void main(String[] args) {
		Son s=new Son();
		 s.main();
		Father f=new Father();
		   s.near();
		Grandfather g=new Grandfather();
		 s.display();
		
		 
	}

}
