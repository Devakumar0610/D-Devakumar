package Encapsulation;

public class Employee 
  {
	int Employee=100;
	String name="Deva";
	String mobile="9566429735";
	private String password="1234";
	
	public static void main(String[] args) {
		Employee e=new Employee();
		  
		System.out.println(e.Employee);
		System.out.println(e.name);
        System.out.println(e.password);
        System.out.println(e.mobile);
	}

}
class Manager
{
	
		void display()	{
			Employee e=new Employee();
		System.out.println(e.Employee);
		System.out.println(e.name);
        System.out.println(e.password);
        System.out.println(e.mobile);	
	}
}