import java.util.*;

public class Customer {  
   public static void main(String[] args)
    {
	Scanner in =new Scanner(System.in);
      	System.out.println("\nEnter The Customer Details");
	System.out.print("\nEnter The Number of outgoing calls : ");
       	int oc=in.nextInt();
	System.out.print("\nEnter The Internet usage in GB : ");
        	int iu=in.nextInt();
	System.out.print("\nEnter The Number of SMS sent in a month : ");
        	int sms=in.nextInt();
       
        	if(oc>=500 & iu>=1 & sms>=300)
	{
		System.out.println("'Platinum customer'");
	}
 	else if(oc>=500 & iu>=1)
	{
		System.out.println("'Golden customer'");
	}
	else if(oc>=500 & iu>=1 & sms>=300)
	{
		System.out.println("'Valuable customer'");
	}
     
	else
		System.out.println("uncategorised Customer");
	
     
   }
}
