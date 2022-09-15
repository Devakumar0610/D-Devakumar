package switchloop;

public class BreakUse {
	public static void main(String[] arg) {
		int i=1;
		for(i=0; i<20; i++) 
		{
			if(i==5) {
			continue;
			}
		System.out.println(i);	
		}
	}

}
