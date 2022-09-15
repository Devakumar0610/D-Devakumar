package decision_making;

public class Ifelseif {

	public static void main(String[] args) {
		int a=-8;
	      if (a%2==0 && a>=0)
	      {
	       System.out.println("+Even");
	      }
	      else if((a%2==0) && (a<=0))
	      {
	       System.out.println("-Even");
	      }
	      else if(!(a%2==0) && (a>0))
	      {
	       System.out.println("+Odd");
	      }
	      else if (!(a%2==0) && a<=0)
	      {
	       System.out.println("-Odd");
	      }
	      else
	      {
	       System.out.println("Error");
	      }



	}

}
