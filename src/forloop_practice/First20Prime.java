package forloop_practice;

public class First20Prime {

	public static void main(String[] args) {
		int k=1;
		int c=1;
	     while(k<=20)
	     {
			int div=2;
			int count=0;                    
			while (div<c)
			{
				if(c%div==0)
				{
					count=count+1;
				}
				div=div+1;
			}
			if(count==0)
			{
				System.out.println("Primevalue" + " = "  +  c);
			k++;
			}
			
			c++;
			
		}

	}
}

