package Collection;

public class Mobiles {
	String brand; 

	public Mobiles(String brand) {
		// TODO Auto-generated constructor stub
		this.brand = brand; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobiles m1 = new Mobiles("Apple"); 
		Mobiles m2 = new Mobiles("Vivo"); 
		Mobiles m3 = new Mobiles("Oppo"); 
		Mobiles[] mobiles = {m1,m2,m3};
		String[] names = {"siva", "dinesh"}; 
		
		Object[] ob = {m1,m2,m3, names[0], names[1], 10, 12.3f, true}; 
		for(int i=0; i<ob.length; i++)
		{
			System.out.println("Object array " + ob[i]);
		}
		
		for(int i=0; i<mobiles.length;i++)
		{
			System.out.println(mobiles[i]);
		}
		for(Mobiles mm:mobiles)
		{
			
		}
		
		

	}
	public String toString()
	{
		//System.out.println(this.brand);
		return this.brand; 
		
	}

}
