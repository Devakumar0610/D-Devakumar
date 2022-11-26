package array;

public class Binary_search {

	public static void main(String[] args) {
		int a[] = { 5, 8, 9, 12, 15 };
		int key = 9;
		int min = 0;
		int max = a.length - 1;
		
		while (min<=max)
		{
			int mid = (min + max) / 2;
			if (key == a[mid]) {
				System.out.println(" present at " + mid +  "   key value is  " + a[mid] );
				break;
			} 
			else if (key <a[mid]) {
				max = mid - 1;
			}
				else {
					min = mid + 1;
				}
			if(min>max) {
				System.out.println("Given number is not present");
			}
			}

	}

}
