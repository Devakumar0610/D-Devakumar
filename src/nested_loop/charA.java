package nested_loop;

public class charA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char k='A';
    for(int i=1; i<=4; i++)
    {

    for(int j=1; j<=i; j++)
    	{
    		System.out.print(k++);
    	}
    	System.out.println();
    }
	}

}
