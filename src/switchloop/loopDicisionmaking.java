package switchloop;

public class loopDicisionmaking {
	public static void main(String[] arg) {
		int i=1;
		while(i<20)
		{
		 if(i%3==0 && i%5==0)
		 {
			 System.out.println("Bing Bang");
		 }
			
		 if(i%3==0)
		 {
			 System.out.println("Bing");
		 }
		 if(i%5==0)
		 {
			 System.out.println("Bang");
			 
		 }
		 else if(i%3!=0 && i%5!=0)
		 {
			 System.out.println(i);
		 }
		 i++;
		}
		
	}

}
