package myPackage11;
// Different Blocks

class MyBlocks{
	static {
		System.out.println("Static block execution before main:DB Connection");
		System.out.println("Static initialization");
	}
	{
		System.out.println("Ananomus block");
		System.out.println("executes before constructor after creation of an object");
	}
	MyBlocks(){
		System.out.println("Constructor block:executes on object creation");
	}
}

public class DifferentJavaBlocks {
	static String cname;//shared data
	static {
		cname="Edubridge";
		System.out.println("Static block DifferentJavaBlocks");
	}
	{
		System.out.println("Normal block");
	}
	DifferentJavaBlocks (){
		System.out.println("Constructor block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		DifferentJavaBlocks ob=new DifferentJavaBlocks();

	}

}
