package Oopsconcepts;
 
public class program 
    {
	   int fact(int n)
	   {
		  int f=1;
		  for(int i=1; i<=n; i++)
		  {
			  f=f*i;
		  }
		  return f;
	   }
     public static void main(String[] args) 
     {
		program p= new program();
		int a = p.fact(4);
		System.out.println(a);
		
		int b = p.fact(5);
		System.out.println(b);
		
		System.out.println(a+b);
	}

}
