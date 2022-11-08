package forloop_practice;

public class Smallestdivisor {

	public static void main(String[] args) {
		int no=49;
		int div=2;
		while(div<no)
		{
			if(no%div==0)
			{
				System.out.println("smallestdivisor");
				break;
			}
			div=div+1;
		}

	}

}
