import java.util.Scanner; 

interface calculate
    {
        void cal(int item);
    }
    class displayA implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item * item;            
        }
    }
    class displayB implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item / item;            
        }
    }
    class Interface 
    {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in); 
            displayA arr1 = new displayA();
            displayB arr2 = new displayB();
            System.out.print("Enter Number For Multiplication of 2 Numbers  : ");  
	   int num1 = sc.nextInt(); 
	   System.out.print("Enter Number Division of 2 Numbers : ");  
	   int num2 = sc.nextInt(); 
            arr1.cal(num1);
            arr2.cal(num2);
            System.out.println("Multiplication is "+arr1.x + "\nDivision is "+ arr2.x);
        }
    }

