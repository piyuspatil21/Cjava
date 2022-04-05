package com.except;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		int num=24,den=0;
		int ans=0;
		int a[]=new int[4];
	    System.out.println("Before division");
	    try {
	    	a[4]=8;
	    	ans=num/den;
	    	
	    }
	    catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
        catch(Exception e)  
        {  
         System.out.println("Parent Exception occurs");  
        }             
	    System.out.println(ans);    
	    System.out.println("after division");    
     
}  
}  	

