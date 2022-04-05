package packageaddinput;
import java.util.Scanner;

public class AddSubMulDiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int first, second, add, subtract, multiply;
	    float devide;
	

	    System.out.print("Enter first numbers : ");
	    first=input.nextInt();
	    System.out.println("Enter second number:");
	    second=input.nextInt();

	    add = first + second;
	    subtract = first - second;
	    multiply = first * second;
	    devide = (float) first / second;

	    System.out.println("Addition = " + add);
	    System.out.println("Subtraction = " + subtract);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + devide);

	}

}
