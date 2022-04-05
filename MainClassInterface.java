package interf.com;
 interface MyInterface{
	int i=10;  //by default public static final
	void m1();//by default interface methods are public abstract
	void m2();
	
}
 interface AnotherInterfce extends MyInterface{
         void m4();
 }
 interface ThirdInterface{
	 void m5();
 }
 class C implements AnotherInterfce,ThirdInterface{
	
	 @Override
     public void m1() {
       System.out.println("M1.");
     }
	 
	 @Override
     public void m2() {
       System.out.println("M2.");
	 }
	 
	 @Override
     public void m4() {
       System.out.println("M4.");
	 }
	 
	
     public void m5() {
       System.out.println("M5.");
	 }
 } 
 
 class B implements AnotherInterfce{
 
	 @Override
     public void m1() {
       System.out.println("M1");
     }
    
	 @Override
     public void m2(){
         System.out.println("M2");
	 }
     
	 @Override
    public void m4() {
    System.out.println("M4");
	 }
 } 
 
class A implements MyInterface{
	
	@Override
	public void m1() {
		System.out.println("M1 method");
	}
	
	@Override
	public void m2() {
		System.out.println("M2 method");
	}
	
	void m3() {
		System.out.println("M3 method");
	}
}

public class MainClassInterface {

	public static void main(String[] args) {

		//MyInterface ob=new MyInterface();//Interface methods are abstract
		A ob1=new A();
		ob1.m1();
		ob1.m2();
	    ob1.m3();//class A method
		
		B obj=new B();
		obj.m1();
		obj.m2();
		obj.m4();
		
		C obj1=new C();
		obj1.m1();
		obj1.m2();
		obj1.m4();
		obj1.m5();
		
		MyInterface iob=new A();
		iob.m1();
		iob.m2();
		

	}
}

 
