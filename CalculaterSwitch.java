package packswitch;
import java.util.Scanner;

public class CalculaterSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		float num1,num2,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		num1=sc.nextFloat();
		System.out.println("Enter the second number");
		num2=sc.nextFloat();
		System.out.println("Enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		choice=sc.next().charAt(0);
		
		switch(choice)
		{
		case '+':
			result= num1+num2;
			System.out.println("Addition is="+num1+"and"+num2+"is"+result);
			break;
		case '-':
			result= num1-num2;
			System.out.println("Subtraction is="+num1+"and"+num2+"is"+result);
			break;
		case '*':
			result= num1*num2;
			System.out.println("Multiplication is="+num1+"and"+num2+"is"+result);
			break;
			
		case '/':	
			result= num1/num2;
			System.out.println("Division is="+num1+"and"+num2+"is"+result);
			break;
		default:
			System.out.println("Invalid operator");
		}

	}

}
