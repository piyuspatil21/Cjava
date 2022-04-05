package com.edu;
@FunctionalInterface
interface Drawable{
	void draw();
}

public class MainApp {

	public static void main(String[] args) {
		Drawable dob=()->{
			System.out.println("Implementation of draw method");
		};
		dob.draw();
	
	//same as
	Drawable ob1=new Drawable() {
		
		@Override
		public void draw() {
			System.out.println("Implementation of draw method");
			}
	};
	//Implementing runnable interface using lambda expression
	Runnable r=()->{
		System.out.println("Inside run method");
	};
	//r.start();not possible
	Thread tob=new Thread(r);
	tob.start();
	}
	
	}
