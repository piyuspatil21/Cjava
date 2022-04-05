package packageageif;
import java.util.Scanner;

public class AgeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>=18) 
			System.out.println("You are eligible for vote");
		else
		System.out.println("You are not eligible for vote");
		
		}

}
