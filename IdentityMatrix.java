import java.util.Scanner;
//Identity Matrix

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, j, r,c, Flag = 1;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Enter Identity Matrix Rows and Columns :");
		r = sc.nextInt();
		c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		System.out.println("  Enter the Identity Matrix Items :  ");
		for(i = 0; i < r; i++) {
			for(j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}		
		}
		
		for(i = 0; i < r ; i++)
		{
			for(j = 0; j < c; j++)
			{
				if(arr[i][j] != 1 && arr[j][i] != 0) {
					Flag = 0;
					break;
				}
			}
		}
		if(Flag == 1) {
			System.out.println("Matrix is an Identity Matrix");
		}
		else {
			System.out.println("Matrix is Not an Identity Matrix");
		}
	}

	}

