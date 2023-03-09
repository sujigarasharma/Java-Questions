import java.util.*;

public class Cloth{  
   public static void main(String[] args)
    {
	Scanner in =new Scanner(System.in);
      	System.out.println("\nEnter The length of cloth in Before Sales");
	System.out.print("\nEnter The Length of cloth m : ");
       	int bm=in.nextInt();
	System.out.print("Enter The Length of cloth cm : ");
        	int bcm=in.nextInt();
	
       	System.out.print("\nEnter The Number of Sales : ");
        	int ns=in.nextInt();
	int balm,balcm,tsam,sam,bam;
	int am=0, acm=0;
        	for(int j=1; j<=ns;j++)
	{
		System.out.println("\nEnter The length of cloth in Sale "+j);
		System.out.print("Enter The Length of cloth m : ");
       		am =am+in.nextInt();
		System.out.print("Enter The Length of cloth cm : ");
        		acm =acm+in.nextInt();
		
		if(acm>100)
		{
			acm=acm-100;
			am++;
		}	
	}
	
	sam= bm*100+ bcm;
	tsam= am*100+ acm;
	
	if(tsam> sam)
	{
		System.out.println("\nInvalid input");
	}
	else
	{
		bam= sam-tsam;
      		balm = bam/100;
		balcm= bam%100;

		System.out.println("\nTotal length of cloth Sales : "+ am +"m "+acm+"cm");
		System.out.println("\nBalance length of cloth : "+ balm +"m "+ balcm +"cm");
	}
   }
}
