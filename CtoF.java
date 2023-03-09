// Java Program to Convert the Temperature 
// Developed for CSC3001 0n 17/02/2021

import java.lang.Math; 
import java.util.Scanner;  


public class CtoF {
public static void main(String[] args) 
{
	try
	{
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter The Celsius : ");
		Double c = sc.nextDouble();
		
		float Fahrenheit= (c.floatValue()*9/5)+32;
		System.out.print("Fahrenheit Value is " + Fahrenheit);
	}
	catch(IOException e)
	{
		System.out.println("Exception Condition Program is ending ");
	}
}
}
