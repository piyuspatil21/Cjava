package com.over;



class Parent {
	int id;
	void display() {
		System.out.println("Parent class display function");
	}
}
class Child extends Parent{
	public void display() {
		System.out.println("Child class display function");
		super.display();
	}
}
public class OverridingMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob=new Child();
		ob.display();
		System.out.println("id="+ob.id);
	}

}
