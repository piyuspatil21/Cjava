package com.except;
import java.util.Scanner;

class Age{
	int age;
	void input() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age");
		age=s.nextInt();
		if(age<19) {
			System.out.println(" Not Eligible for vote");
			//throw new Age("No eligible for vote")
		}
		else {
			System.out.println(" Eligible for vote");
		}
	}
}

public class ThrowEx {

	public static void main(String[] args) {
		Age ob=new Age();
		ob.input();

	}

}
