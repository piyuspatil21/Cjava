import java.util.Scanner;
//Transpose Matrix

public class TransposeOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter no.of rows for first matrix");
	       int r=sc.nextInt();
	       System.out.print("Enter no.of coloumns for first matrix");
	       int c=sc.nextInt();
	        int a[][]=new int[r][c];
	        
	        
	       
	        for(int i=0;i<r;i++) {
	            for(int j=0;j<c;j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        sc.close();
	        int trans[][]=new int[r][c];
	        
	      
	        for(int i=0;i<r;i++) {
	            for(int j=0;j<c;j++) {
	                trans[i][j] = a[i][j];
	            }
	        }
	                
	        System.out.println("The transpose of the matrix");
	        for(int i=0;i<r;i++) {
	            for(int j=0;j<c;j++) {
	            	System.out.print(trans[i][j]+" ");
	            }
	            System.out.println(" ");
	            
	    }
	}
}

	   