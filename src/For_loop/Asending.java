package For_loop;

public class Asending {

	public static void main(String[] args) {
		
		int a = 512367;
		int count = 0;
		int c = a % 10;
		a = a / 10;
			    
		   while (a > 0) {
			  int b = a % 10;
			      a = a / 10;
			       
			      if (c < b) {
			        count = 1;
			      }
			      c = b;
			    }
			    if (count == 1) {
			      System.out.println("Not");
			    } else {
			      System.out.println("yes");
			    }

	}

}
