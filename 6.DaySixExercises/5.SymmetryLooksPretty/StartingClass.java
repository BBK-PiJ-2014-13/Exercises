public class StartingClass {
	public static void main(String[] args) {

		MatrixChecker matrixChecker = new MatrixChecker();
		Matrix matrix = new Matrix(3,3);
		
		matrix.setElement(0, 0, 1);
		matrix.setElement(0, 1, 1);
		matrix.setElement(0, 2, 1);
		matrix.setElement(1, 1, 1);
		matrix.setElement(1, 2, 1);
		matrix.setElement(2, 2, 1);
		
		matrix.prettyPrint();
		
		System.out.println((matrixChecker.isUpperTriangular(matrix.array)));
		
	}

}
