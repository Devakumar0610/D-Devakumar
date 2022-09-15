package For_loop;

public class Fibonacciseries {
	public static void main(String[] arg) {

	int a,b=-1, c=1;
    for ( int i=1; i<=9; i++)
    {
     a=b+c;
     System.out.println(a);
     b=c;
     c=a;
    }
  } 
}
