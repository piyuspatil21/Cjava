package myPackage11;
class CopyMyClass
{
	int i,j;
	CopyMyClass(int i,int j){
		this.i=i;
		this.j=j;
		System.out.println("First object i="+this.i);
		System.out.println("First object j="+this.j);
	}
	public CopyMyClass(CopyMyClass firstobj) {
		this.i=firstobj.i;
		this.j=firstobj.j;
		System.out.println("Second object i="+this.i);
		System.out.println("Second object j="+this.j);
	}
}

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyMyClass firstobj=new CopyMyClass(10,20);
		CopyMyClass secondobj=new CopyMyClass(10,20);
		
	}

}
