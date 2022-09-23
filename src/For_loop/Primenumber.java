package For_loop;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=87;
    int c=0;
    
    for(int i=0; i>n; i++)
    {
    if(n%i==0) 
    {
    	c++;
    break;
    }
	}
    if(c==0)
    	System.out.println(n+"prime number");
    else
    	System.out.println(n+" not prime number");
}
}