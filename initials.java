import java.util.*;  
import java.lang.Math; 

public class initials  
{
    public static void main(String args[])
    {
        	Scanner in =new Scanner(System.in);

	System.out.print("\nEnter The your Full Name : ");
	String msg1= in.nextLine();
	System.out.print("\nEnter The your Father Name : ");
	String msg2= in.nextLine();

	char ini=msg2.charAt(0);
	
	System.out.println("\nFull Name with your Initials : " + msg1 + " " + ini);
	
        }  	
}