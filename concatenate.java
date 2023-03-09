import java.util.*;  
import java.lang.Math; 

public class concatenate 
{
    public static void main(String args[])
    {
        	Scanner in =new Scanner(System.in);

	System.out.print("\nEnter The String 1 : ");
	String msg1= in.nextLine();
	System.out.print("\nEnter The String 2 : ");
	String msg2= in.nextLine();
	String msg3= msg1.concat(msg2);
	System.out.println("\nConcatenate string :"+ msg3);
	
        }  	
}