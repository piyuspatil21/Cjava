package packswitch;
import java.util.Scanner;


public class SwitchVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter Character");
		c=sc.next().charAt(0);
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':System.out.println(c+"is a Vowel");
		break;
		default: System.out.println(c+"is a non-vowel");
		}
		

	}

}
