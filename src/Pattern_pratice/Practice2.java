package Pattern_pratice;

public class Practice2 {

	public static void main(String[] args) {
		for(int col=1; col<=10; col+=2)
		{
			System.out.print(col);
			if(col==9)
			{
				col = 0;
				System.out.println();
			}
		}

	}

}
