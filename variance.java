import java.util.*;
import java.lang.Math; 
  

public class variance{

    public static void main(String[] args) {
        
	Scanner sc= new Scanner(System.in); 	

	float[] x = new float[100];  	
 
    	System.out.print("\nEnter the Number of elements : ");
    	float n= sc.nextFloat(); 
	
    	float sum=0;
	float sum1=0;

    	for (int i = 0; i < n; i++)
    	{
		System.out.print("Enter Number " + (i+1) + " : ");
        		x[i] = sc.nextFloat();  
    	}
    	for (int i = 0; i < n; i++)
    	{
        		sum = sum + x[i];
    	}

    	float average = sum / (float)n;

   	for (int i = 0; i < n; i++)
    	{	
        		sum1 = sum1 + (float)Math.pow((x[i] - average), 2);
    	}

    	float variance = sum1 / (float)n;
    	float std_deviation = (float)Math.sqrt(variance);
    	
    	System.out.println("\nVariance of all elements = " + variance);
    	System.out.println("Standard deviation = " + std_deviation);
   }
}

 
