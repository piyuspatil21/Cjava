package abst.com;

abstract class Animal{
	void sleep() {
		System.out.println("Zzzz");
	}
	abstract void eat();
}
class Cow extends Animal{
	@Override
	void eat() {//abstract method
		System.out.println("Grass");
	}
	void features() {//own cow class method
		System.out.println("Horns");
	}
	
}

public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow ob=new Cow();//abstract method as well as cow class method
		ob.eat();
		ob.sleep();
		ob.features();
		
		Animal ob1=new Cow();
		ob1.eat();
		ob1.sleep();
		//ob1.featues()//refere to only Parent class
		
	

	}

}
