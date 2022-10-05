package Assignment;

public class Print9 {

	public static void main(String[] args) {
		int k=1;
		
    for(int i=1; i<=4; i++)
    {
    	k=1;
    	for(int j=1; j<=i; j++)
    	{
    		k= k*i;//1*1=1;2*2=4;3*3*3=27;*4*4*4*4=256;
    	}
    	 System.out.println(k);
    }
   
	}
}

