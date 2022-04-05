package packageternary;

public class ComparisionOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 5;
		int b = 3;
		boolean c;
		c = (a > b);
		System.out.println(c);
		c = (a >= b);
		System.out.println(c);
		c = (a <= b);
		System.out.println(c);
		c =(a == b);
		System.out.println(c);*/
		
		/*int a = 10,b = 5;
	    System.out.println("a>b:"+(a>b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));*/
		
		/*Ternary operator 2 numbers
		int large = (a > b)?a:b;
		System.out.println("The largest of "+a+" and "+b+" is "+large);*/
		
		int a = 3,b = 5,c = 7,d = 9,max;
		max = ((a>b && a>c && a>d)?a:(b>c && b>d)?b:(c>d?c:d));
		System.out.println("The largest number among "+a+" and "+b+" and "+c+" and "+d+" is "+max);
		

	}

}
