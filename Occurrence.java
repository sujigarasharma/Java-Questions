import java.util.*;  

public class Occurrence{

  	public static void main(String[] args){
    	String str = "VIT University";
    	int strFirstIndex = 0;
	int strLastIndex = 0;
    	System.out.println("String : "+str);
	strFirstIndex= str. indexOf('i',1);
    	strLastIndex = str.lastIndexOf('i');
	System.out.println("The First Occurrence of character i in the String : "+ strFirstIndex);
   	System.out.println("The last Occurrence of character i in the String : "+strLastIndex);
 }
}