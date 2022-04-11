package packswitch;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option");
		System.out.println("***Menu***");
		System.out.println("1.Square");
		System.out.println("2.Rectangle");
		System.out.println("3.Triangle");
		System.out.println("4.Circle");
		opt=sc.nextInt();
		
		  switch(opt)
          {
                case 1: System.out.println("Enter side:");
                        int x=sc.nextInt();
                        int area_square=x*x;
                        System.out.println("Area:"+area_square);
                        break;
               
                case 2: System.out.println("Enter length and breadth:");
                        int l=sc.nextInt();
                        int b=sc.nextInt();
                        int area_rectangle=l*b;
                        System.out.println("Area:"+area_rectangle);
                        break;     
                case 3: System.out.println("Enter height and base:");
                        float h=sc.nextFloat();
                        float bs=sc.nextFloat();
                        float area_triangle=0.5f*h*bs;
                        System.out.println("Area:"+area_triangle);
                        break;
                case 4: System.out.println("Enter radius:");
                        float r=sc.nextFloat();
                        float area_circle=3.14f*r*r;
                        System.out.println("Area:"+area_circle);
                        break; 
                default:
        			System.out.println("Invalid");
        		}
        		

        	}

        }

		

	
