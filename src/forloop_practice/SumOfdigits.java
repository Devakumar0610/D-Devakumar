package forloop_practice;

public class SumOfdigits {

	public static void main(String[] args) {
	int cake =1234;
	int sum=0;
	int count=0;
	while(cake>0)
	{
		sum=sum+cake%10;
		cake=cake/10;
		count=count+1;
	}
	System.out.println("count"  + " = " + count);
	System.out.println(sum);
	}

	}


