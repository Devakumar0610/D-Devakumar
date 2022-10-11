package Assignment1;

public class Print15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i, j, k;
    
    System.out.println("---Prime Numbers from 1 to 20---");
    for(i=2; i<=20; i++)
    {
       k = 0;
       for(j=2; j<i; j++)
       {
          if(i%j==0)
          {
             k++;
             break;
          }
       }
       if(k==0)
          System.out.println(i);
    }
	}
 }
