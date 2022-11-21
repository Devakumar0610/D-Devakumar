package string;

public class Convert_string_to_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="bharathi1234";
       try {
    		   int no= Integer.parseInt(s);
     
       System.out.println(no);
	}
       catch(NumberFormatException nfe)
       {
    	   System.out.println("No,not all no.s");
       }

}
}
