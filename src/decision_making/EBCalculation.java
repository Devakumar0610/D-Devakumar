package decision_making;

public class EBCalculation {

	public static void main(String[] args) {
	int a=550;
	if (a <=100 && a >0)	
	{
      System.out.println("0");
	}
    if(a>100 && a<=200)
    {
    
    	int b=a-100;
    	double k = (b * 1.5)+100;
    	
    	System.out.println(k);
    }
    if(a>200 && a<500)
    {
    	int b =  (a-200) *3 ;
    	int k = b + 200;
    	System.out.println(k);
    }
    if(a>500 && a<=550)
    {
    	double b = (a-500)*6.6;
        double k = b + 500 ;
        System.out.println(k);
    	
    }
    
    
}
}