import java.util.Scanner;
public class BadSubscriptCaught 
{
   public static void main(String [] args)
   {
      String[] firstNames = {"Shawn", "Sean", "Shaun", "Shon", "Seann", "Seaghan", "Shan", "Sion", "Shaugn", "Shayne"};
      String integer;
      Scanner input= new Scanner(System.in);
      System.out.println("Enter an integer from 1-10 ");
      integer = input.nextLine(); 

      try
         {            
            int i = Integer.parseInt(integer);
			   i = i-1;
			   System.out.println(firstNames[i]);
			   input.close();
		    }
        catch (ArrayIndexOutOfBoundsException e)
        {
			System.out.println("The integer entered is out of range :(");
		  }
        catch (NumberFormatException e) 
        {
				System.out.println("Not a valid integer ");
		  }
		
	   }	
}
