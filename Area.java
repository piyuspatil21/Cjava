package packagearea1;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		a=6.5f;
		b=4.5f;
		double square_area=a*a;
		double rectangle_area=a*b;
		double triangle_area=a*b/2;
		double circle_area=3.14*a*a;
		System.out.println("The area of square =  "+a+" is "+square_area);
		System.out.println("The area of rectangle width= "+a+" and length= "+b+" is "+rectangle_area);
		System.out.println("The area of triangle base= "+a+" and hight= "+b+" is "+triangle_area);
		System.out.println("The area of circle with radius="+a+" is "+circle_area);
	}

}
