package Assignment2;

public class movingtowardsleft15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int i = a[a.length - 1];
		for (int t = a.length - 1; t > 0; t--) {
			a[t] = a[t - 1];
		}
		a[0] = i;
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]);
		}
	}
	
	

}
