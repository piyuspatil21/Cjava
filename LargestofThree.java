package myPackage11;
class LargeThree{
	int i,j,k;
	LargeThree(){ //Constructor with no argument
		System.out.println("Inside constructor");
		i=3;
		j=9;
		k=5;
		System.out.println("i="+i+"and j="+j+" and k="+k );
	}
	LargeThree(int i,int j){ //constructor with 2 arguments
		System.out.println("with argument");
		this.i=i;//i=1 //this refers to present object (ob1)
		this.j=j;
		
	}
	LargeThree(int i,int j,int k){ //constructor with 2 arguments
		System.out.println("with argument");
		this.i=i;//i=1 //this refers to present object (ob1)
		this.j=j;
		this.k=k;
	}
		

	void largestnum() {
		int l=(i>j)?i:j;
		System.out.println("largest is="+l);
		
	}
	void Largestthree() {
		int l=(i>j && i>k)?i:(j>i && j>k)?j:k;
		System.out.println("largest three number is="+l);
	}
}

public class LargestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargeThree ob=new LargeThree(); //calls with argconstructor
		LargeThree ob1=new LargeThree(1,2);
		LargeThree ob2=new LargeThree(1,2,3);
		


	}

}
