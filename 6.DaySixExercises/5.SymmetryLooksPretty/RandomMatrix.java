import java.util.Random;

public class RandomMatrix {

	public int[][] getRandomMatrix(int i1, int i2) {
		Random random = new Random();
		int[][] array = new int[i1][i2];

		for (int i = 0; i < i1; i++) {
			for (int j = 0; j < i2; j++) {
				array[i][j] = random.nextInt(9);
			}
		}
		
		return array;

	}
}
