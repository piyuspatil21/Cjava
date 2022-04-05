package packagesmall;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,min;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=input.nextInt();
		System.out.println("Enter the second number");
		b=input.nextInt();
		System.out.println("Enter the third number");
		c=input.nextInt();
		
		min= c < (a < b ? a : b) ? c : ((a < b) ? a : b);  
		 System.out.println("The smallest number ="+min);

	}

}
