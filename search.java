import java.util.*;  

public class search{

    public static void main(String[] args) {
        
	Scanner sc= new Scanner(System.in); 	

	int[] array = new int[100];

    	System.out.print("Enter The Size of the Array : ");

    	int n= sc.nextInt(); 

   	 for(int i=1;i<=n;i++)
    	{
		System.out.print("Enter the Element "+ i + ": ");
      		array[i]= sc.nextInt();  

    	}
	
    	System.out.print("\n ENTER 1 FOR LINEAR SEARCH\n");
	System.out.print(" ENTER 2 FOR BINARY SEARCH\n");

    	System.out.print("\n Enter your Choice : ");
	int choice = sc.nextInt();  

	System.out.print(" Enter the Search element : ");

    	int search_key = sc.nextInt();  

    	

    	
	switch(choice)
    	{

    		case 1:

        		for(int i=1;i<=n;i++)
        		{
			if(search_key == array[i])
            	 	{
                        		int location = i;
		     	   	System.out.println("The location of Search Key " + search_key + " is " +location);
		   	}

   		 }
		break;

    	case 2:

    		int low = 1;

    		int high = n;

    		int mid = (low + high)/2;

    		int i=1;

    		while(search_key != array[mid])
    		{

       			if(search_key <= array[mid])
        			{

            			low = 1;

           			high = mid+1;

            			mid = (low+high)/2;

        			}
        			else
        			{

            			low = mid+1;

            			high = n;

           			mid = (low+high)/2;

        			}

		}

    		System.out.println("The location of Search Key " + search_key + " is " + mid);
		
		break;      

        		
    	default:

        		System.out.print("Invalid Input");

	}

}
}

 
