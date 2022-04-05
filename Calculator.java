package myPackage11;
//Calculator Using BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Cal{
	int num1,num2,ans;
	
	void input()throws IOException{
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//2 method
		//readline()->string
		//read()->ascii value of character
		System.out.println("Enter first number");
		System.out.println("Enter Second number");
		
		//num=br.readLine();//"89"
		num1=Integer.parseInt(br.readLine());
	}
		void add() {
			ans=num1+num2;
			System.out.println("Sum="+ans);
		}
		void sub() {
			ans=num1-num2;
			System.out.println("Subtraction="+ans);
	}
		void mult() {
			ans=num1*num2;
			System.out.println("Product="+ans);
}

public class Calculator {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Main");
		//Create an object
		Cal ob=new Cal();
		ob.input();
		ob.add();
		ob.sub();
		ob.mult();

	}

}
}


