package array;

public class FirstTwoSmallestNumber {

	public static void main(String[] args) {
		
		int[] marks = {65,90,-73,-72};
		int small1=Integer.MAX_VALUE,small2=Integer.MAX_VALUE;
		
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]<small1)
			{
				small2= small1;
				small1=marks[i];
			}
			else if(marks[i]<small2)
			{
				small2=marks[i];
			}
			
		}
		System.out.println("smallest two values are" + small1+ "and"+small2);

	}

}


	


