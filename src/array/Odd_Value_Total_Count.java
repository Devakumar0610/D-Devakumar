package array;

public class Odd_Value_Total_Count {

	public static void main(String[] args) {
		int a[]= {2,5,7,9,24,12,3};
		int total=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				total=total+a[i];
			count++;
		}
		}
		System.out.println("Total of odd values " + total);
		System.out.println("Count of odd values " + count);
	}

}
