package com.except;

public class SingleTryCatchBlock {

	public static void main(String[] args) {
		int num=9,k=0;
		int ans=0;
		
		System.out.println("before division");
		try {
			ans=num/k;
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("Divide by Zero");
		}
		System.out.println(ans);
		System.out.println("After Division");

	}

}
