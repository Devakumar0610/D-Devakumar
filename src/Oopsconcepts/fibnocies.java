package Oopsconcepts;

public class fibnocies {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//int a,b=1, c=1;
	int n=8;
	int a,b,c;
    void finoccies()
	{
    for ( int i=1; i<=n; i++)
    {
     a=b+c;
     System.out.println(a);
     b=c;
     c=a;
	}
	}
    public static void main(String[] args)
    {
    	fibnocies F1 = new fibnocies();
                F1.a= 0;
        fibnocies F2= new fibnocies();
                F2.b= 1;
        fibnocies F3 = new fibnocies();
                F3.c= 1;
           F1.finoccies();
           F2.finoccies();
           F3.finoccies();
                
                
    		
    }
}
