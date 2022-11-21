package array;

public class duplicutValue {

	public static void main(String[] args) {
		int t=1;
		int a[]={1,2,3,4,4,5};
		int b[]=new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length; j++)
			{
			if	(a[i]==a[j])
			{
				t++;
				b[j]=-1;
			}
		    }
		
		if(b[i]!=-1)
		{
			b[i]=t;
		}
		t=1;
	}
	for(int i=0; i<a.length;i++)
	{
		if(b[i]>1)
		{
			System.out.println(a[i]);
		}
	}

}
}