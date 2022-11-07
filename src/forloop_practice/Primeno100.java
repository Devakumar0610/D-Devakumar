package forloop_practice;

public class Primeno100 {

	public static void main(String[] args) {
		int n0=1;
		while(n0<=100) {
			int div=2;
			int count=0;
			while (div<n0)
			{
				if(n0%div==0)
				{
					count=count+1;
				}
				div=div+1;
			}
			if(count==0)
			{
				System.out.println("Prime" + "=" + n0);
			}
			n0=n0+1;
			}
	}

	}
