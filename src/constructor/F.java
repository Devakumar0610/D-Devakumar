package constructor;
class A{
static {
	System.out.println("1 static");
}                                        //(Constructor calling;first call in static,second calling in non static constructor, third in constructor)
A()
{
	System.out.println("Hi I am constructor");
}
{
	System.out.println("Hi this non static constructor");
}
void Deva1()
{
	System.out.println("Hi Deva");
}
}

class B extends A
{
	static {
		System.out.println("2 static");
	}
    B()
    {
    	System.out.println("Hi I am constructor");
    }
    {
    	System.out.println("Hi this non static constructor");
    }
    void Deva2()
    {
    	System.out.println("Hi Deva");
    }
}
public class F {
	
	public static void main(String[] args) {
		 B s=new B();
		 
		 s.Deva2();

	}

}
