package packageshapes;

import java.util.Scanner;

public class AreaOfShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius");
		double r=input.nextDouble();
		double cir_area=(3.142*r*r);
		
		System.out.println("Enter the length");
		double l=input.nextDouble();
		System.out.println("Enter the Width");
		double w=input.nextDouble();
		double rect_area=l*w;
		 
		System.out.println("Enter the base");
		double b=input.nextDouble();
		System.out.println("Enter the hight");
		double h=input.nextDouble();
		double tri_area=(b*h)/2;
		
		System.out.println("Enter the side");
		double s=input.nextDouble();
		double square_area=(s*s);
		
		System.out.println("The area of cicle is"+cir_area);
		System.out.println("The area of rectangle "+l+" and "+w+" is"+rect_area);
		System.out.println("The area of triangle "+b+" and "+h+" is"+tri_area);
		System.out.println("The area of square "+s+" is"+square_area);
		

	}

}
