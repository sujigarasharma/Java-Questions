import java.util.*;  

public class union{
    
    static void printIntersection(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
	System.out.print("\nIntersection : "); 
        while (i < m && j < n) 
	{ 
            if (arr1[i] < arr2[j]) 
	    	i++; 
            else if (arr2[j] < arr1[i])
	    	j++; 
            else 
	    { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
    } 

    static int printUnion(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
	System.out.print("\nUnion : "); 
        while (i < m && j < n) 
	{ 
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else 
	    { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
  
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
  
	return 0; 
    } 


    public static void main(String[] args) 
    {
        
	Scanner sc= new Scanner(System.in); 	
	int[] arr1 = new int[100];
	int[] arr2 = new int[100];
    	
	System.out.print("Enter The Size of the Array 1 : ");
	int n1 = sc.nextInt(); 
	for(int i=0;i<n1;i++)
    	{
		System.out.print("Enter the Element "+ i + ": ");
      		arr1[i]= sc.nextInt();  

    	}
	System.out.print("Enter The Size of the Array 2 : ");
	int n2 = sc.nextInt(); 
	for(int i=0;i<n2;i++)
    	{
		System.out.print("Enter the Element "+ i + ": ");
      		arr2[i]= sc.nextInt();  

    	}
	printIntersection(arr1, arr2, n1, n2); 
	printUnion(arr1, arr2, n1, n2); 
    	

    }
}

 
