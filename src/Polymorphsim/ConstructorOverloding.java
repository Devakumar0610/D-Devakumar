package Polymorphsim;

public class ConstructorOverloding 
   {
	int rollNo;
	String Name;
	int mark;
	
	ConstructorOverloding()
	{
		rollNo=10;
		Name="Deva";
		mark=100;
	}
	ConstructorOverloding(int rollNo,String Name,int mark)
	{
		this.rollNo=rollNo;
		this.Name=Name;
		this.mark=mark;
	}
	void a()
	{
		System.out.println(rollNo);
		System.out.println(Name);
		System.out.println(mark);
	}
	
	

	public static void main(String[] args) {
		
		ConstructorOverloding s= new ConstructorOverloding(7,"Devakumar",99);
		      s.a();
	}

}
