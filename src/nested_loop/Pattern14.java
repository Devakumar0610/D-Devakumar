package nested_loop;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int k=1;
    int n=4;
    for(int i=1; i<=4; i++)
    {
    for(int j=1; j<=i; j++)	
    {
    	System.out.print(k+" ");
    	k+=2;
    }
    }
    System.out.println(" ");
	}
    

}
