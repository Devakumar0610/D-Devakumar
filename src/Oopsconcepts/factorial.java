package Oopsconcepts;

public class factorial {

	
    int a;
    int fact=1;
    void fact() 
    {
    for(int i=1; i<=a; i++)
    {
    	fact=fact*i;
    }
    System.out.println(fact);
    }
    public static void main(String[] args)
    {
    factorial F1 =new factorial();
     F1.a= 5; 
     F1.fact();
    }
    
}  


