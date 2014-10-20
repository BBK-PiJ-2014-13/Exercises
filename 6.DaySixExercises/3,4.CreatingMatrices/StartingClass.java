
public class StartingClass {

	public static void main(String[] args) {

		Matrix matrix = new Matrix(3, 3);
		
		matrix.setMatrix("1,2,3;4,5,6;7,8,9.");
		matrix.prettyPrint();

	}

}
