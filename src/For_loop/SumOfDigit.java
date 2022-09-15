package For_loop;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num=5723;
    int sum=0,b;
    while(num>0)     //5+7+6+9
    {
    int r=num%10;
    sum=sum+r;
    num=num/10;
    }
    if(sum>10)
    {
   	b=sum%10;
    sum=sum/10;
    sum=sum+b;
 
    System.out.println(sum);
   }
}
	
}


