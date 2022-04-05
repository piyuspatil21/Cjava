import java.util.Scanner;
//Multiplication of two matrix

public class MultiplicationOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i, j, r, c;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Multiplication Matrix Rows & Columns :  ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		int[][] arr1 = new int[r][c];
		int[][] arr2 = new int[r][c];
		
		System.out.println("Enter the First Multiplication Matrix Items :  ");
		for(i = 0; i < r; i++) {
			for(j = 0; j < c; j++) {
				arr1[i][j] = sc.nextInt();
			}		
		}
		System.out.println(" Enter the Second Multiplication Matrix Items :  ");
		for(i = 0; i < r; i++) {
			for(j = 0; j < c; j++) {
				arr2[i][j] = sc.nextInt();
			}		
		}
		System.out.println("The Multiplication of two Matrix ");
		for(i = 0; i < r; i++) {
			for(j = 0; j < c; j++) {
				System.out.format("%d\t ", (arr1[i][j] * arr2[i][j]));
			}
			System.out.println("");
		}
	}
}