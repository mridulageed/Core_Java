package in.rays.basics;

public class Table2 {

	public static void main(String[] args) {
		int[][] table = new int[10][10];
		int i, j = 0;

		for (i = 0; i < table.length; i++) {
			for (j = 0; j < table.length; j++) {
				table[i][j] = (i + 1) * (j + 1);
			}
		}

		for (i = 0; i < table.length; i++) {
			for (j = 0; j < table.length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
