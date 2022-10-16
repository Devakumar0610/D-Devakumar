package Polymorphsim;

public class MethodOverloading {
	void poly (int a,int b)
	{
	if(a>b)
	{
		System.out.println("a is a Big");}
	else
	{
		System.out.println("b ia a Small");
	}
	}
	void poly(int a,int b,int c)	
	{
	if((a>b)&&(a>c))	
	{
		System.out.println("a is a big");}
	else  if((b>a)&&(b>c))	
	{
		System.out.println("b is a big");}
	else
	{
		System.out.println("c is a big");
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading s=new MethodOverloading();
           s.poly(1,2);
           
	}

}
