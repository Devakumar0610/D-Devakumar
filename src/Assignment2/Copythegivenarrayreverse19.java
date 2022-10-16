package Assignment2;

public class Copythegivenarrayreverse19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int i=0;
		int j=7;
		int b[]=new int [a.length];
		for(i=0;i<=a.length-1;i++) {
			b[i]=a[j];
			j--;
			System.out.println(b[i]);
		}		
		}
	
	

}
