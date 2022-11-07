package forloop_practice;

public class CountofDigit {

	public static void main(String[] args) {
		int sum=1234;                           //Count of digit given number
		int count=0;
		while(sum>0)
		{
			System.out.println(sum%10);
			sum=sum/10;
			count = count+1;
		}
	System.out.println("count Value"   + " = " + count);
	}

}
