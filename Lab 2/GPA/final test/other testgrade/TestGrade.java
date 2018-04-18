public class TestGrade
{
   public static void main(String args[]) throws Exception
      {
         int id;
         int grade;
         String grades = new String();
         try
            {
               id = 123;
               System.out.println("Student id number: " + id);
               System.out.println("Enter the grade for the above student id number.");
               grade = (char)System.in.read();
               grades = String.valueOf((char)grade);
               if(grade != 'A' && grade != 'B' && grade != 'C' &&
               grade != 'D' && grade != 'F'&& grade !='I')
               throw (new GradeException(grades));
               System.out.println("The id and grade for this student is:");
               System.out.println(" " + id + " " + (char)grade);
             }

         catch(GradeException e)
            {
               System.out.println("Invalid grade - " + e.getMessage());
            }

      }  

}
