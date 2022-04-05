package odd;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+"is even number");
		}
		if(num%2!=0) {
			System.out.println(num+"is odd number");
		}

	}

}
