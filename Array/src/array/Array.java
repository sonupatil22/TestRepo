package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int b[][] = new int[2][];

		b[0] = new int[3];
		b[1] = new int[5];

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array elements");

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = scan.nextInt();

			}
			System.out.println();
		}
		System.out.println("Print the data");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				//System.out.println("(" + i + "," + j + ")");
				System.out.printf("%4d", b[i][j]);
				
			}
			System.out.println();
		}
		
		b[0][2] = 88;
		System.out.println("After changing the data");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				//System.out.println("(" + i + "," + j + ")");
				System.out.printf("%4d", b[i][j]);
				
			}
			System.out.println();
		}
		
		

	}

}
