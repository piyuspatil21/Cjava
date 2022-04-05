package packagelargest;
import java.util.Scanner;

public class UserInputLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a,b,max;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=input.nextInt();
        System.out.println("Enter the second numbers");
        b=input.nextInt();
        
        max=(a>b)?a:b;
        System.out.println("The largest number ="+max);
        		
        
	}

}
