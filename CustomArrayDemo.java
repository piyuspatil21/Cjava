package javacollection;

import java.util.ArrayList;
import java.util.Iterator;

class StudentDet{
	int roll;
    String name;
    float fees;
    
   public StudentDet(int i,String string,float f) {
	   roll=i;
	   name=string;
	   fees=f;
   }
	   
   }
public class CustomArrayDemo{
	public static void main(String[] args) {
		StudentDet ob1=new StudentDet(1,"Piyu",9000);
		StudentDet ob2=new StudentDet(2,"Rutu",9000);
		ArrayList<StudentDet>al=new ArrayList<>();
		al.add(ob1);
		al.add(ob2);
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			StudentDet ob=(StudentDet) itr.next();
			System.out.println("roll number"+ob.roll);
			System.out.println("name"+ob.name);
			System.out.println("fees"+ob.fees);
			
		}
		
		

	}

}
