package For_loop;

public class NewPrime {
	
	public static void main(String[] args) {
		
		int n=50;
		int cn;
		int count;
		int sum = 0;
		
		for(int i=1; i<=n; i++ )
		{
			cn = i;
			count= 0;
			
			for(int j = 1; j<=cn; j++)
			{
				if(cn%j==0)
				{
					count++;
				}
			}
		if(count==2)
		{
		   cn = 1;
			 sum = sum + cn;
			//System.out.println(cn);
		}

		}
	System.out.println(sum);
	}
	

}
