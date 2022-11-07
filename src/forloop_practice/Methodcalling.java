package forloop_practice;

public class Methodcalling {

	public static void main(String[] args) 
	{
		Methodcalling bp=new Methodcalling();
		bp.find_sum(5678);
	}
	void find_sum(int cake)	                 ////TBD
	{
		int sum=0;
		while(cake>0)
        {
        sum = sum+(cake%10);
	    cake =cake/10;
        }
		
	}

}
