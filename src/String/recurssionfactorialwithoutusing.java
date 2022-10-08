package String;

public class recurssionfactorialwithoutusing {

	int fact(int n)
	{
		if(n>1)
		{
		int f=fact(n-1);
	    return n*f;
		}
		else {
			return 1;
		
		}
	}
		public static void main(String[] args) {
			recurssionfactorialwithoutusing s=new recurssionfactorialwithoutusing();
			            int a= s.fact(5);
			            System.out.println(a);
		}

	}


