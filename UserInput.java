package packageuser;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name;
		float fees;
		char gender;
		double loan;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		name=input.next();
		
		System.out.println("Enter your age");
		age=input.nextInt();
		input.nextLine();
		
		
		System.out.println("Enter your fees");
		fees=input.nextFloat();
		
		System.out.println("Enter your gender M/F");
		gender=input.next().charAt(0);
		
		System.out.println("Enter your loan");
		loan=input.nextDouble();
		
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Fees="+fees);
		System.out.println("Gender="+gender);
		System.out.println("Loan="+loan);
		
		

	}

}
