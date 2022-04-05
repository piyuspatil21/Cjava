package com.except;

public class ExceptionDemo {

	public static void main(String[] args) {
		int num=24,den=0;
		int ans=0;
		int a[]=new int[4];
	    System.out.println("Before division");
	    try {
	    	 System.out.println("Inside try");
	    	a[2]=8;
	    	ans=num/den;
	    	System.exit(0);//terminate
	    	//return;
	        
	    	System.out.println("Inside try after return");
	    }
	    /*catch(ArrayIndexOutOfBoundsException e) {
	    	e.printStackTrace();
	    }
	    catch( ArithmeticException e) {
	    	e.printStackTrace();
	    }*/
	    catch(Exception e) {
	    	//e.printStackTrace();
	    	 System.out.println(e);//catch when there is error
	    	//resource close inside catch block->no,not it will execute
	    }
	    finally {
	    	System.out.println("Excutes always");
	    	//resource closing
	    }
	    System.out.println(ans);
	    System.out.println("After division");
	
		

	}

}
