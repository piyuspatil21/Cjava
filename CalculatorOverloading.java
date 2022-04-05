package myPackage11;
//Addition using function Overloading
class Addition{
	void add(int i,int j)
	{
		int add1=i+j;
		System.out.println("Integer Addition is:"+add1);
	}
	void add(float i,float j)
	{
		float add1=i+j;
		System.out.println("Float Addition is:"+add1);
	}
	void add(double i,double j)
	{
		double add1=i+j;
		System.out.println("Double Addition is:"+add1);
	}
	void add(short i,short j)
	{
		short add1=(short) ((short) i+j);
		System.out.println("Short Addition is:"+add1);
	}
	void add(byte i,byte j)
	{
		byte add1=(byte) ((byte) i+j);
		System.out.println("Byte Addition is:"+add1);
	}
	
}

public class CalculatorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ob=new Addition();
		ob.add(2, 2);
		ob.add(1.2f, 1.2f);
		ob.add(22.2, 12.2);
		ob.add((short)1, (short)2);
		ob.add((byte)55, (byte)55);
		

	}

}
