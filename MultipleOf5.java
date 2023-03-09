import java.util.*;  

public class MultipleOf5
{
	public static void main(String args[]){ 
	Scanner in = new Scanner(System.in);
 	int year;
  	Thread t1=new Thread()
	{  
   		public void run()
		{ 
                 int year;
        for(year=1000;year<=2000;year++){
			if((year%400==0)||(year%4==0 && year%100 !=0))
                               {
				
					try{
						Thread.sleep(150);
                                              System.out.println(year);
					}
					catch(InterruptedException e)
                                        {
		    			System.out.println(); 
					}  
				}                   
	    		}
	    		
    		}  
  	};  
	
  	t1.start();  
 	}  
}