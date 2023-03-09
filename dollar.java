// Java Program to Convert Dollar to Rupees 
// Developed for CSC3001 0n 17/02/2021

import java.lang.Math; 
import java.util.Scanner;  


public class dollar {
public static void main(String[] args) 
{
	try
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter The Dollar Amount : ");
		Double d = sc.nextDouble();
		System.out.print("Enter The Today INR Rate of the Dollar : ");
		Double inr = sc.nextDouble();
		float res= d.floatValue()*inr.floatValue();
		System.out.println("Dollar Value is " + res +" RS");
	}
	catch(Exception e)
	{
		System.out.println("Exception Condition Program is ending ");
	}
}
}
