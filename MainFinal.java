package finalKeyword;

class Employee{
	//final int eid=10;
	//final String cname="Microsoft";
	final static String cname="Microsoft";
	private Employee() {
		
	}
	
	void change_method() {
		//eid=eid+10;//not be changed
		//cname="Infosys";//error final values cannot be changed
	}
	final void add() {
		System.out.println("Addition final method");
		myMethod();
	}
	private void myMethod() {
		System.out.println("Private method");
		
}

final class EduEmployee extends Employee{
	/*final void add() {//you can't override in child
		System.out.println("child Addition final method");
	}*/
}

/*class A extends EduEmployee{ //cannot inherit final class error*/


public class MainFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EduEmployee ob=new EduEmployee();
		ob.add();*/
		Employee eob=new Employee();
		eob.add();

	}

}
}
