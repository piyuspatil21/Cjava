import java.util.Scanner;
//sum of diagonal matrix

public class SumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        // Initializing the 3X3 matrix i.e. 2D array
int arr[][] = new int[3][3];
System.out.println("Enter the 3x3 matrix elements :");
int row, col, mainSum = 0, counterSum = 0;
// Loop to take user input
for(row=0;row<3;row++)
    for(col=0;col<3;col++)
        arr[row][col] = scan.nextInt();

System.out.print("Matrix is : ");
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
// Loop to take the sum of main diagonal elements
for(row=0;row<3;row++)
    for(col=0;col<3;col++)
    {
        if(row==col)
            mainSum+=arr[row][col];
        // if(row+col==2)
    }
System.out.println("The sum of main diagonal elements is : "+mainSum);
// Loop to take the sum of counter diagonal elements
for(row=0;row<3;row++)
    for(col=0;col<3;col++)
    {
        if(row+col==2)
            counterSum+=arr[row][col];
    }
System.out.println("The sum of counter diagonal elements is : "+counterSum);
}
}