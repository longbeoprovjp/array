import java.util.Scanner;
import java.util.Random;
public class arrays {

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		Scanner socan = new Scanner(System.in);
		Random rand = new Random();
		int[] numbers = new int[MAX_SIZE];
		int[] stID = new int[MAX_SIZE];
//		String[] stLastName = new String[MAX_SIZE];
//		int[] num = {10,11,12};
//		String[] lastNames = {"Long", "beo"};
//		System.out.println(num[1]);
//		int[] n = new int[MAX_SIZE];
//		System.out.println(num.length);
//		numbers[5] = 19;
//		System.out.println(numbers[5]);
//		
		for (int i = 0; i < stID.length; i++) {
			stID[i] = rand.nextInt(100)+1;
		}
		int i;
//		
//		for (int i = 0; i < stID.length; i++) {
//			System.out.println(stID[i]);
//		}
//		System.out.println("-------------------");
		
//
//		for (int i = 0; i<numbers.length; i++) {
//			numbers[i] = rand.nextInt(100)+1;
//		}
//		for (i = 0; i<numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
//		
//		int sum = 0;
//		for (int i = 0; i<numbers.length; i++) {
//			sum = numbers[i] + sum;
//		}
//		System.out.println("sum = " + sum);
//		
//
//		int min = numbers[0];
//		for (int i = 0; i< numbers.length; i++) {
//			if (numbers[i]<min) {
//				min = numbers[i];
//			}
//		}
//		System.out.println(min);
//		int i = 0;
//		int minIndex = 0;
//		int min = numbers[0];
//		for (i = 0; i< numbers.length; i++) {
//			if (numbers[i]<min) {
//				min = numbers[i];
//				minIndex = i;
//			}
//		}
//		System.out.println(min);
//		System.out.println(minIndex);
		
//reverse arrays
//		for (i = 0; i < stID.length; ++i) {
//			System.out.println(stID[i]);
//		}
//		int swap;
//		for (i = 0; i < stID.length/2; ++i) {
//			swap = stID[i];
//			stID[i] = stID[numbers.length-1-i];
//			stID[stID.length-1-i] = swap;
//		}
//		for (i = 0; i < stID.length; ++i) {
//			System.out.println(stID[i]);
//		}
		
//2 dimension arrays
		int[][] nn = { {22, 44,66}, {97, 98, 99} };
		int[][] myTable = new int [2][3];
		for (i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++) {
				myTable[i][j] = rand.nextInt(100)+1;
			}
		}
		for (i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(myTable[i][j] + " ");
			}
		}
		System.out.println();
		int sum = 0;
		for (i = 0; i <2; i++) {
			for(int j = 0; j < 3; j++) {
				sum += myTable[i][j];
			}
		}
		System.out.println(sum);
	}

}

