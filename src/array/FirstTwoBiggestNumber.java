package array;

public class FirstTwoBiggestNumber {

	public static void main(String[] args) {
		
		int[] marks = {65,90,73,72};
		int big1=Integer.MIN_VALUE,big2=Integer.MIN_VALUE;
		
		for(int i=0; i<marks.length; i++)
		{
			if(marks[i]>big1)
			{
				big2=big1;
				big1=marks[i];
			}
			else if(marks[i]>big2)
			{
				big2=marks[i];
			}
			
		}
		System.out.println("Biggest two values are" + big1+ "and"+big2);

	}

}
