// Java Program to find the Calculate Room Area
// Developed for CSC3001 0n 10/02/2021

import java.lang.Math; 
import java.util.Scanner;  


class Room
{
	double l,b, area;
	void getdata()
	{
		Scanner sc= new Scanner(System.in); 	
		
		System.out.print("Enter The Length : ");  
		l= sc.nextDouble();  
		

		System.out.print("Enter The Breadth : ");  
		b= sc.nextDouble(); 
		
	}

	void findarea()
	{	
		area=l*b;
		System.out.print("The Area is : " + area);
	}
}
	

public class CalRoomArea
{

	public static void main(String args[]) 
	{
        		Room r1= new Room();
		r1.getdata();
		r1.findarea();
		
    	}
}