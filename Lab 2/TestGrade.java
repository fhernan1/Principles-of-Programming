import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class TestGrade
{
   public static void main(String[] args)
   {
      int[] studentID = {123, 233, 322, 411, 533, 622, 722, 811, 911, 1033};
      String[] studentGrades = {"A", "B", "C", "D", "F", "I"};
      String[] letterGrades = new String[10];
      Scanner input = new Scanner(System.in);
      String error = new String();
      boolean isValid = false;

     
      
      for (int i = 0; i < studentID.length;  i++ ) 
      {
      try 
      {
         System.out.println("Enter the grade for " + studentID[i]);
         letterGrades[i] = input.nextLine();
         isValid = false;
          for (int j = 0; j < studentGrades.length;  j++ )
            {
               if (letterGrades[i].equals(studentGrades[j]))
               {
              isValid = true;
               }
             }
           if(isValid == true)
            {
               System.out.println("Student " + studentID[i] +  " has grade " + letterGrades[i]);
            }
            
               
           if(isValid == false)
             {
                error = letterGrades[i] + " is invalid.";
                throw (new GradeException(error));
              }
         }
          catch (GradeException e)
            {
            System.out.println(e.getMessage() + " kjjStudent " + studentID[i] +  " has grade I");
            
            }
      }
   }
}
