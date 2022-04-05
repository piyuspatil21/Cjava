import java.util.Scanner;
//sum of matrix

public class SumofElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Scanner scan = new Scanner(System.in);
	        // Initializing the 3X3 matrix i.e. 2D array
	        int arr[][] = new int[3][3], sum = 0;
	        System.out.println("Enter the 3x3 matrix elements : ");
	        int row, col;
	        // Loop to take user input
	        for(row=0;row<3;row++)
	            for(col=0;col<3;col++)
	                arr[row][col] = scan.nextInt();
	                
	       System.out.print("The matrix elements are : "); 
	       // Loop to print the elements 
	       for(row=0;row<3;row++) 
	       { 
	           // Used for formatting 
	           System.out.print("\n"); 
	           for(col=0;col<3;col++) 
	           { 
	               System.out.print(arr[row][col]+" "); 
	           } 
	       }
	       
	       System.out.print("\n"); 
	       // Loop to take the sum of elements
	        for(row=0;row<3;row++)
	            for(col=0;col<3;col++)
	                sum+=arr[row][col];
	        System.out.println("The sum of all the matrix elements is : "+sum);
	    }
	}