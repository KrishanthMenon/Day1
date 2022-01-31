package com.capgemini.helloworld;
import java.util.Scanner;

public class My_user_input 
{
	public static void main(String args[])
	{
		int a;
		String b;
		Scanner sc=new Scanner(System.in);
		System.out.println("a: ");
		a=sc.nextInt();		
		System.out.println("String: ");
		b=sc.next();
		System.out.println(a);
		System.out.println(b);
	}

}
