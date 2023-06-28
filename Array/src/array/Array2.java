package array;

public class Array2 {

	static int b[][] = { { 45, 85, 88 }, { 56, 50, 99, 10, 32 } };

	static void printData() {

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("%4d", b[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	static void updateData(int x, int y, int element) {
		b[x][y] = element;
	}
	
	static int getData(int a, int c) {
		return b[a][c];
		
	}
	
	public static void main(String[] args) {
		printData();
		updateData(0, 1, 55);
		System.out.println("After update th data");
		printData();
		int s1 = getData(1, 2);
		System.out.println(s1);
		int s2 = getData(1, 4);
		System.out.println(s2);
		
		
	}

}
