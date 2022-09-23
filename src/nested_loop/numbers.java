package nested_loop;

public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=0;
		int g;
		
        for( int i=1; i<n; i++)
        {
        	k++;
        for (int j=1; j<n; j++)
        {
        	g=k%2;
        	System.out.print(g+"  ");
        	k++;
        }
        System.out.println();
        
	}

}
}

