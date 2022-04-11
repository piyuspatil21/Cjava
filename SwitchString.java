package packswitch;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cname;
		Scanner sc=new Scanner(System.in);
		System.out.println("***Menu***");
		System.out.println("Enter which course you  want to join");
		System.out.println("Java");
		System.out.println("Python");
		System.out.println("Oracle");
		cname=sc.next();
		
		switch(cname) {
		case "java":
			System.out.println("Your course is Java");
			break;
		case "Python":
			System.out.println("Your course is Java");
			break;
		case "Oracle":	
			System.out.println("Your course is Java");
			break;
		default:
			System.out.println("Invalid");
		}
		

	}

}
