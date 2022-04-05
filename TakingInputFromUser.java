package elevatordrivercom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

 class UserName {
	ArrayList<String>namelist1=new ArrayList<>();//Creating ArrayList to store result
	
void checkname(String sname,int n) {
	if(namelist1.contains(sname)==false)//checking if name present in arraylist
	{
		namelist1.add(sname);//if not them add to ArrayList
		//System.out.println(namelist);
	}else {
		System.out.println("Name is already present in list,please add another name");
	}
}
void show() {
	System.out.println(namelist1);//to show final output
 }
public class TakingInputFromUser{
	public static void main(String[] args) throws NumberFormatException,IOException{
		
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		UserName ob=new UserName();//Object of user class
	    
		System.out.println("Enter number of names you want to add in ArrayList");
		int n=Integer.parseInt(br.readLine());//taking inputs from user number of inputs
		
		for(int i=0;i<n;i++) {
		  System.out.println("Enter names");
		  String sname=br.readLine().trim();
		  
		  ob.checkname(sname,n);//calling checkname method
		}
		ob.show();
	}
}
}
 