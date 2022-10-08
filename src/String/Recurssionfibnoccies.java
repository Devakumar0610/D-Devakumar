package String;

public class Recurssionfibnoccies {
	int a,b=-1,c=1;
	int k=0;
	void fibnoccies()
	{
		a=b+c;
		System.out.println(a);
		
		
		//System.out.println(a);
		b=c;
		c=a;
		k++;
		if(k<=6)
		{
			fibnoccies();
		}
	}
	public static void main(String[] args) {
		
		Recurssionfibnoccies s=new Recurssionfibnoccies();
		          s.fibnoccies();
	}

}
