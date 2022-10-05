package Assignment;

public class Print14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j=2;
		    int count=0;
		    for(i=1; i<=100; i++)
		    {
		    	count=0;
		    
		    for(j=2; j<i; j++)
		    {
		    	if(i%j==0)
		    	{
		    		count++;
		    		break;
		    	}	
		    }
		    if(count==0)
			{
				System.out.println(i);
			}
		    }
		    
		    	
		    
		}
		}


