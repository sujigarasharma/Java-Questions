import java.util.*;  

public class count{

    public static char
    getCharFromString(String str, int i) 
    { 
        return str.charAt(i); 
    } 
	
    public static int count(String s, char c) 
    { 
        int res = 0; 
        for (int i=0; i<s.length(); i++) 
        { 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 
  
    public static void main(String[] args) 
    {
	Scanner sc= new Scanner(System.in); 
	System.out.print("\nEnter The Text to count the letters : ");  
	String str= sc.next(); 
	
	for (int i=0; i<str.length(); i++) 
        { 
        		char c = getCharFromString(str, i); 
        		System.out.println(c + "=" + count(str, c)); 
	}
    }
}