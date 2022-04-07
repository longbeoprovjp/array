import java.util.Random;

public class haiD {

	public static void main(String[] args) {
		Random rand = new Random();
		int i;
		int j;
		int[][] myTable = new int [3][4];
		for (i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				myTable[i][j] = rand.nextInt(100)+1;
			}
		}
		for (i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print(myTable[i][j] + " ");
			}
		}
		System.out.println();
		int sum = myTable[0][0];
		for (i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				sum = sum + myTable[i][j];
			}
		System.out.println("The sum of " + (i + 1) + " row is " + sum + ".");
		sum = 0;
		}
		for (j = 0; j < 4; j++) {
			for(i = 0; i < 3; i++) {
				sum = sum + myTable[i][j];
			}
		System.out.println("The sum of " + (j + 1) + " column is " + sum + ".");
		sum = 0;
		}
		int smallNum = myTable[0][0];
		int locRow = myTable[0][0];
		int locCol = myTable[0][0];
		for (i = 0; i < 3; i++) {
			for(j = 0; j < 4; j++) {
				if (smallNum > myTable[i][j]) {
					smallNum = myTable[i][j];
					locRow = i + 1;
					locCol = j + 1;
				}
			}
		}
		System.out.println("The smallest number is " + smallNum + " at " + locRow + " row and " + locCol + " column.");
	}
}
