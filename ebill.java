import java.util.*;
import java.lang.Math;   

public class ebill{
   
    public static void main(String[] args) 
    {
	Scanner sc= new Scanner(System.in); 	
	System.out.print("\nEnter The units : ");  
	double unit= sc.nextInt(); 
	
	double totalbill = 0;	
	double amt=0;

	if(unit<=50)
	{
		amt=unit * 0.50;
		totalbill=amt+amt*25/100;
		System.out.println("The Total EB Bill : " + totalbill);	
	}
	else if(unit>=51 && unit<=150)
	{
		amt=unit*0.75;
		totalbill=amt+amt*25/100;
		System.out.println("The Total EB Bill : " + totalbill);	
	}
	else if(unit>=151 && unit<=250)
	{
		amt=unit*1.25;
		totalbill=amt+amt*25/100;
		System.out.println("The Total EB Bill : " + totalbill);	
	}
	else
	{
		amt=unit*1.50;
		totalbill=amt+amt*25/100;
		System.out.println("The Total EB Bill : " + totalbill);	
	}
    }
}