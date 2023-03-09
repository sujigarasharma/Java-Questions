//Super Class
class Rectangle
    {
    	int length, breadth;
	// Constructor	
        	Rectangle(int l, int b)
        {	
          	length = l; 
		breadth = b;
       	}

       	int area()
       	{
		return(length*breadth);
       	}


    };

// Sub Class

    	class Box extends Rectangle
     	{
         	int height;
       
        		//Constructor
	
        		Box(int l, int b, int h) 
        		{
             		super(l,b); 
              		height = h;
	
         	}

        		int volume()
        		{
			return (length * breadth * height);
        		}
	

      	};

     	class inheritance
      	{
		public static void main(String args[])
		{
              		Rectangle R1 = new Rectangle(10,20);
	     		int a = R1.area();

             		System.out.println("\n\n Area is: "+a);

	  		Box B1 = new Box(11, 22, 33);

	 		int v = B1.volume();

			System.out.println("\n\n Volume is: "+v);
		

		};
	};
