package For_loop;

public class FibnnaciWithoutthird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int f=-1;
    int s=1;
    int t=0;
     for(int i=0; i<=7; i++)
     {
    	 System.out.println(f+s);  
    	 s=f+s;      // 0=f+s;
    	 f=s-f;      //-1=2;
     }
	}

}
