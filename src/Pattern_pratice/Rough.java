package Pattern_pratice;

import java.util.Scanner;

public class Rough {

	String method1(int n, int x) {

		for (int row = 0; row < n; row++) {
			for (int space = 0; space < n - row; space++) {
				System.out.print(" ");
			}
			// ------------------------------------------------
			for (int col = 0; col <= row; col++) {
				System.out.print((col + 1) * (x) + " ");
			}
			// -------------------------------------------------------------
			System.out.println();
		}//row
		method2();
		return "";
	}// method1
		// ------------------------------------------------------------

	int method2() {
		System.out.println("Deva");
		return 0;

	};

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rough r = new Rough();
		System.out.println(" enter the num 1");
		int n = s.nextInt();
		System.out.println(" enter the num 2");
		int x = s.nextInt();
		s.close();
		try {
		System.out.println(r.method1(n, x));
		}catch(Exception muthu) {
			System.out.println("catch block");
		}
	}// pmain
}// class
