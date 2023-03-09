import java.util.*;  
import java.lang.Math; 

public class anagram 
{
    public static void main(String args[])
    {
        	Scanner in =new Scanner(System.in);

	System.out.print("\nEnter The String 1 : ");
	String msg1= in.nextLine();
	System.out.print("\nEnter The String 2 : ");
	String msg2= in.nextLine();
	int c1=0;

	if(msg1.length()==msg2.length())
	{
		for(int j=0;j<msg1.length();j++)
		{
			char a=msg1.charAt(j);
			
			for(int k=0;k<msg2.length();k++)
			{
				char b=msg2.charAt(k);
				if(a==b)
				{
					msg2 = charRemoveAt(msg2, k);
					c1++;
				}
			}
		}
		
		if(c1== msg1.length())	
		{
			System.out.println("\nThe two strings are anagram");
		}
		else
		{
			System.out.println("\nThe two strings are Not a anagram");
		}
		
	}
	else
	{
		System.out.println("\nThe two strings are Not a anagram");
	}
   }
	public static String charRemoveAt(String msg2, int k) 
	{  
              return msg2.substring(0, k) + msg2.substring(k + 1);  
         }  	
}