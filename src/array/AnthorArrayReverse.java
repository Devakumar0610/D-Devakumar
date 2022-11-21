package array;

public class AnthorArrayReverse {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };

		int len = a.length;

		int b[] = new int[len];

		int i = 0;
		int j = len - 1;

		while (i < a.length) {
			b[i] = a[j];
			i++;
			j--;

		}
		for (i = 0; i < b.length; i++) {
			System.out.println(b[i]+" ");
		}

	}

}
