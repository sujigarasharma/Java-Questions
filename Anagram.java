import java.util.*;
public class Anagram
{
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);

     	String str1,str2;
	System.out.print("Enter The String 1 : ");
	str1 = sc.nextLine();
	System.out.print("Enter The String 2 : ");
	str2 = sc.nextLine();

      	if (str1.length()==str2.length()) 
	{
         	char[] arr1 = str1.toCharArray();
         	Arrays.sort(arr1);
        	 	System.out.println(Arrays.toString(arr1));
         	char[] arr2 = str2.toCharArray();
         	Arrays.sort(arr2);
         	System.out.println(Arrays.toString(arr2));
         	
         	if(Arrays.equals(arr1, arr2)) 
		{
            		System.out.println("Given strings are Anagram");
         	} 
		else 
		{
            		System.out.println("Given strings are not Anagram");
         	}	
      	}
	else 
	{
            	System.out.println("Given strings are not anagrams");
         }	
   }
}
