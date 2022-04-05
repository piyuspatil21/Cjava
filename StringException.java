package com.except;

public class StringException {

	public static void main(String[] args) {
		String s=null;
		System.out.println("Before Length");
		try {
			int l =s.length();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}

		System.out.println("After Length");

	}

}
