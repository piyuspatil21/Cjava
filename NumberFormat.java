package com.except;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NumberFormat {

	public static void main(String[] args)throws IOException {
		String name=null;
		String address=null;
		int age=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		name=br.readLine();
		System.out.println("Enter address");
		address=br.readLine();
		try {
			System.out.println("Enter age");
			age=Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException  | NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("name"+name);
		System.out.println("address"+address);
		System.out.println("age"+age);

	}

}
