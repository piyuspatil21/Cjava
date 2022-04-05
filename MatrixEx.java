import java.util.Scanner;

public class MatrixEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int arr[][] ;
	        int r,c;
	        
	        System.out.print("Enter the number of rows :");
	        r=scan.nextInt();
	        
	        System.out.print("Enter the number of columns:");
	        c=scan.nextInt();
	        
	        arr=new int[r][c];
	        
	        System.out.print("Enter "+r+"x"+c+"matrix elements");
	        
	      
	        for(int i=0;i<r;i++) {
	            for(int j=0;j<c;j++) {
	                arr[i][j] = scan.nextInt();
	}
	        }
	
	        
	       
	        
	        
	        for(int i=0;i<r;i++)
	        {
	            for(int j=0;j<c;j++)
	            {
	                System.out.print(arr[i][j]+" ");
	            }
	        }
	        
	    }
	}