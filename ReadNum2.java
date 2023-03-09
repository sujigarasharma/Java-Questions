	// Using Wrapper Class - convert String obj to Primitive Objects (int, float, double, char)

	//import java.io.DataInputStream;
	import java.io.*;
	class ReadNum2
	{
	   public static void main(String args[])
                       {
		try
		{
		DataInputStream din = new DataInputStream(System.in);
		int num1 = 0;
		float num2 = 0.0f;
		
		System.out.flush();

		System.out.println("Enter an Integer value:");
		
 		//String str1 = din.readLine();

		//System.out.println("Input String is:"+str1);

		num1 = Integer.parseInt(din.readLine());
		
		System.out.println("Enter an float value");
		num2 = Float.valueOf(din.readLine()).floatValue();
	
		System.out.println("Integer value is "+num1);

		System.out.println("Float value is"+num2);
		}

		catch (IOException e)
		 {
			System.out.println("I/O Error !!!");
			System.exit(1);
		}
	}	
        }