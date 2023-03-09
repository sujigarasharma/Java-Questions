import java.util.*;  

public class Sort{
   
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 	
	System.out.print("\nEnter The total number of Elements : ");  
	int n=sc.nextInt();
	int[] arr = new int[100];
	for(int i=0;i<n;i++)
    	{
		System.out.print("Enter the Element "+ (i+1) + ": ");
      		arr[i]= sc.nextInt();  

    	}
   	for (int i = 0; i < n-1; i++) 
      	{
       		for (int j = 0; j < n-i-1; j++)  
           	{
			if (arr[j] > arr[j+1])
			{
				int temp=arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
              		}
		}
	}
	double sum=0;
	System.out.print("\nSortest Elements   : ");
	for (int i=0; i < n; i++) 
	{
		System.out.print(arr[i] + "  ");
		sum=sum+arr[i];
	}
	System.out.print("\nMinimum Element is : " + arr[0]);
	System.out.print("\nMaximum Element is : " + arr[n-1]);
	System.out.println("\nAverage is         : " + (sum/n));
    }
}