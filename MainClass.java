package com.edu;

@FunctionalInterface
interface Addition{
	int add(int i,int j);
	}
public class MainClass {

	public static void main(String[] args) {
		//Lambda expression
		Addition aob=(int i,int j)->{
			int s=i+j;
			//System.out.println("sum="+s);
			return s;
		};
		System.out.println("Sum="+aob.add(2, 4));
		Addition sob1=(i,j)->(i+j);
		System.out.println("Sum="+sob1.add(2, 4));;
		}

	}

