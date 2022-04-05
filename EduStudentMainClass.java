package myPackage11;
//Student details using private keyword

import java.util.Scanner;

class EduStudent{
	private int id;
	private String name;
	private float fees;
	
	/*protected int id;
	protected String name;
	protected float fees;*/
	
	
		public void accept() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			name=sc.nextLine();
			System.out.println("Enter id");
			id=sc.nextInt();
			System.out.println("Enter fees");
			fees=sc.nextFloat();
	
			
			/*public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter id");
		id=sc.nextInt();
		System.out.println("Enter fees");
		fees=sc.nextFloat();*/
		
	}

	public void studentDetails() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Fees:"+fees);
		
	}
}
public class EduStudentMainClass {

	public static void main(String[] args) {
		EduStudent ob=new EduStudent();
		ob.accept();
	    ob.studentDetails();

	}

}
