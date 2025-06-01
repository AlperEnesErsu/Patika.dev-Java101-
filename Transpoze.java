public class Transpoze {

	public static void matrisiYazdir(int[][] matris) {
		for (int[] satır : matris) {
			for (int eleman : satır) {
				System.out.print(eleman + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matris = { { 2, 3, 4 }, { 5, 6, 4 } };

		System.out.println("Matris:");
		matrisiYazdir(matris);

		int[][] transpoz = new int[matris[0].length][matris.length];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				transpoz[j][i] = matris[i][j];
			}
		}

		System.out.println("Transpoze:");
		matrisiYazdir(transpoz);
	}
}
