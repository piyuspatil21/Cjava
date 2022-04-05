package packagesubject;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		float maths, eng, marathi, comp, chem; 
	     double total, average, percentage;
	    
	    
	    System.out.println("Enter marks of five subjects:");
	    System.out.print("Enter marks of Maths subjects:");
	    maths=input.nextFloat();
	    System.out.print("Enter marks of English subjects:");
	    eng=input.nextFloat();
	    System.out.print("Enter marks of Marathi subjects:");
	    marathi=input.nextFloat();
	    System.out.print("Enter marks of Computer subjects:");
	    comp=input.nextFloat();
	    System.out.print("Enter marks of chem subjects:");
	    chem=input.nextFloat();

	    /* Calculate total, average and percentage */
	    total = maths + eng + marathi + comp + chem;
	    average = (total / 5.0);
	    percentage = (total / 500.0) * 100;

	    /* Print all results */
	    System.out.println("Total marks ="+total);
	    System.out.println("Average marks = "+average);
	    System.out.println("Percentage = "+percentage);

	}

}
