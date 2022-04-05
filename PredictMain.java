package com.edu;
import java.util.function.Predicate;

public class PredictMain {

	public static void main(String[] args) {
		//Predicate
		Predicate<Integer> gt=(i)->i>10;
		System.out.println("Before calling Test");
		boolean b=gt.test(18);
		System.out.println(b);

	}

}
