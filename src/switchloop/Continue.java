package switchloop;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i=1;
    while(i<7)
    {
    	if(i==4)
    	{
    		//i++;
    		continue;
    	}
    System.out.println(i++);
	}

	}
}
