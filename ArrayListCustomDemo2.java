package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int empid;
	String name;
	float sal;
	int age;
	String depname;
	public Employee(int empid,String name,float sal,int age,String depname) {
	super();
	this.empid=empid;
	this.name=name;
	this.sal=sal;
	this.age=age;
	this.depname=depname;
	
}

public class ArrayListCustomDemo2 {

	private static final String Employee = null;

	public static void main(String[] args) {
		Employee ob1=new Employee(101,"Rutuja",30000,25,"IT");
		Employee ob2=new Employee(102,"Harshu",30000,25, "Computer");
		Employee ob3=new Employee(103,"Neha",30000,25,"Network");
		Employee ob4=new Employee(104,"Praju",30000,25,"IT");
		ArrayList<Employee>al=new ArrayList<>();
		al.add(ob1);
		al.add(ob2);
		al.add(ob3);
		al.add(ob4);
		Iterator<Employee> itr=al.iterator();
		System.out.println("ID\tName\tSalary\tAge\tDepartmentName");
		while(itr.hasNext()) {
			Employee emp=(Employee)itr.next();
			System.out.print(emp.empid+"\t");
			System.out.print(emp.name+"\t");
			System.out.print(emp.sal+"\t");
			System.out.print(emp.age+"\t");
			System.out.print(emp.depname+"\t");
			
			System.out.println();
			
		}

	}

}
}
