// Java Program to Find the Interest 
// Developed for CSC3001 0n 17/02/2021

import java.lang.Math; 
import java.util.Scanner;  


public class Intrest {
public static void main(String[] args) 
{
	Scanner sc= new Scanner(System.in); 

	System.out.print("Enter the Principle :"); 
	double p =sc.nextDouble();
	System.out.print("Enter the Rate of interest :"); 
	double r =sc.nextDouble();
	System.out.print("Enter the Time :"); 
	double t =sc.nextDouble();

	System.out.print("Press 1 to Find the Simple Interest \n");
	System.out.print("Press 2 to Find the Compound Interest \n\n");
	System.out.print("Chose the Interest : ");
	int con =sc.nextInt();
	
	switch (con)
	{
		case 1 :
			
			double si=(p*r*t)/100;
			System.out.print("The Simple Interest is : " + si);
				break;
		case 2 :
			double ci=p*Math.pow((1+r/100),t);
			System.out.print("The Compound Interest is : " + ci);
				break;
	}
}
}
	

