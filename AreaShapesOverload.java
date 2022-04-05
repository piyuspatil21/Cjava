package myPackage11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a program for area of different shapes

class Area{
	 void squareArea(BufferedReader br)throws NumberFormatException,IOException{
	  System.out.println("Enter the side of square");
	  BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	  int side=Integer.parseInt(br1.readLine());
	  int area=side*side;
	  System.out.println("the area of the square is "+area);
	 }
	 
	float circleArea(float r)
		{
			   float area=(float)(Math.PI*r*r);
			return area;
		}
	int rectangleArea(int l,int b)
	{
		int area=l*b;
		return area;
		
	}
	
	 
} 


public class AreaShapesOverload {

	public static void main(String[] args)throws NumberFormatException,IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Area ob=new Area();
		ob.squareArea(br);
		System.out.println("Enter radius of circle");
		float rad=Float.parseFloat(br.readLine());
		float res=ob.circleArea(rad);
		System.out.println("Area of circle="+res);
		System.out.println("Enter the length and breadth of rectangle");
		int l=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		int ans=ob.rectangleArea(l,b);
		System.out.println("Area of rectangle="+ans);

	}

}
