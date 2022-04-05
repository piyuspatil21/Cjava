package packageconv;
import java.util.Scanner;

public class AgeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,days,minutes,seconds;
		Scanner input=new Scanner(System.in);
		System.out.println("enter your age");
		year=input.nextInt();
		month=12*year;
		days=365*year;
		minutes=days*24*60;
		seconds=minutes*60;
		System.out.println("The months are"+month);
		System.out.println("The days are"+days);
		System.out.println("The minutes are"+minutes);
		System.out.println("The second are"+seconds);


	}

}
