public class MatrixChecker {

	// Checked. Not bugged.
	public boolean isSymmetrical(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}

		return true;

	}

	public boolean isSymmetrical(int[][] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != a[j][i]) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isUpperTriangular(int[][] a) {

		for (int rows = 0; rows < a.length; rows++) {
			for (int columns = 0; columns < a[0].length; columns++) {
				if (rows > columns) {
					if (a[rows][columns] != 0) {
						return false;
					}
				}
				return true;
			}
		}

		return true;
	}
}
