package packagedays;
import java.util.Scanner;

public class DaysConvertSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int days=input.nextInt();
		System.out.println("Time converter");
		System.out.println("Enter the numbers of days");
	
		int hours = 24*days;
		System.out.println("Hours are"+hours);
		
		int minutes = 60*hours;
		System.out.println("Minutes are"+minutes);
		
		int seconds = 60*minutes;
		System.out.println("Your days converted into seconds is "+seconds);
		
		
		/*Scanner sc=new Scanner(System.in);
		int days,sec;
		System.out.println("Enter the days");
		days=sc.nextInt();
		System.out.println("Convert days to seconds");
		int ans=days*60*60;
		System.out.println(ans);*/
		
		
		
		

	}

}
