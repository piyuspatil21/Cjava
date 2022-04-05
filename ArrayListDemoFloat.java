package javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemoFloat {

	public static void main(String[] args) {
		ArrayList<Float> ob1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements of floating point value you want to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter element");
			float val=sc.nextFloat();
			ob1.add(val);
		}
		//Display
		Iterator it=ob1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
