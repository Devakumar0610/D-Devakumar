package array;

public class ArrayMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {76,75,70,80,90};
    
    int max=0;
    for(int i=0; i<a.length; i++)
    {	
    if(max<a[i])
    {
    max=a[i];
    }
   }
    System.out.println(max);
 }
	
}





