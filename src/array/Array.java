package array;

public class Array {
	
	public static void main(String[] args) {
		
		int[] arr = {1,7,9,2,5,4,3};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int t =arr[j];
					
					arr[j] = arr[i];
					
					arr[i]= t;
				}
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
