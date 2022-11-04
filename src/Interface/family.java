package Interface;

interface family 
   {
	public	void takecare();
	public	void attendfunction();
   }
	
interface company
	{
		 public void attendance();
		public void dresscode();
	}
class person implements family,company
{
	public void takecare()
	{
		System.out.println("takecare"); 
	}
	public	void attendfunction()
	{
		System.out.println("attenfunction");
	}
	public	void attendance()
	{
		System.out.println("attendance");
	}
	public void dresscode()
	{
		System.out.println("dresscode");
	}

	public static void main(String[] args) {
		family Raj=new person();
		Raj.takecare();
		Raj.attendfunction();
		
		

	}

}
