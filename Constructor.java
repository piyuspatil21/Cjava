package myPackage11;
class A{
	private int id;
	public float salary;
	A(int id){
		this.id = id;
		System.out.println("Class A Constructor"+id);
	}
}
class B extends A{
	B(int id){
		super(id);
		System.out.println("Class B Constructor");
	}
}
class C extends B{
	C(int id,float sal){
		super(id);//used to call parent class constructor
		salary=sal;
		System.out.println("Class C Constructor");
		System.out.println("Class C Constructor "+salary);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C(25,3.4f);

	}

}
