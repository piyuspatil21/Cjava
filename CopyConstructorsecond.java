package myPackage11;
class Student{
	int id;
	String name;
	static String cname;
	public Student(int i,String string) {
	this.id=i;
	this.name=string;
	}
    public Student(Student s1) {
	this.id=s1.id;
	this.name=s1.name;
    }
  static
  	{
	cname="DYP";
  	}
  void display() {
	System.out.println("id="+id);
	System.out.println("Name="+name);
	System.out.println("College name="+cname);
    }
	}
  public class CopyConstructorsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Piyu");
		Student s2=new Student(s1);
		s1.display();
		s2.display();
		

	}

}
