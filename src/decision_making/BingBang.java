package decision_making;

public class BingBang {

	public static void main(String[] args) {
	int n=5;
	if(n%5==0)
	{
	System.out.println("Bang");	
	}
    if(n%3==0)
    {
    System.out.println("Bang");
    }
	if(n%5!=0 && n%3!=0)
    System.out.println(n);
	}
}
