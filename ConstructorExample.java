package MyPackP;
class MyConstr{
	int i,j;
	//Syntax
	//classname(){}
	MyConstr(){ //Constructor with no argument
		System.out.println("Inside constructor");
		i=3;
		j=9;
		System.out.println("i="+i+"and j="+j );
	}
    MyConstr(int i,int j){ //constructor with 2 arguments
	System.out.println("with argument");
	this.i=i;//i=1 //this refers to present object (ob1)
	this.j=j;
}

void largestNumber() {
	int l=(i>j)?i:j;
	System.out.println("largest is="+l);
}
public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConstr ob=new MyConstr();//->call default constructor of  object class
		   //degault 	
        MyConstr ob1=new MyConstr(4,8); //calls with argconstructor
        ob.largestNumber();//method calling  with explicit calling
        ob1.largestNumber();


	}

}
}
