import java.io.*;
import java.util.Locale;
import java.util.Scanner;
public class StudentStanding 
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader bufferedReader = new BufferedReader(new
      InputStreamReader(System.in));
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      boolean isWorking = true;
      while (isWorking)
      {
         System.out.print("ID: ");
         int id = scanner.nextInt();
         System.out.print("First name: ");
         String firstName = bufferedReader.readLine();
         System.out.print("Last name: ");
         String lastName = bufferedReader.readLine();
         System.out.print("Grade point average: ");
         double gradePointAverage = scanner.nextDouble();
         System.out.println("Student " + firstName + " " + lastName +
         " with ID " + id + " have " + gradePointAverage + " grade point average.");
         if (gradePointAverage >= 2.0)
         {
            PrintWriter out = new PrintWriter("GoodStanding.txt");
            out.write("ID: " + Integer.toString(id));
            out.write("\n");
            out.write("First name: " + firstName);
            out.write("\n");
            out.write("Last name: " + lastName);
            out.write("\n");
            out.write("Grade point average: " +
            Double.toString(gradePointAverage));
            out.write("\n");
            out.write("\n");
            out.close();
            System.out.println(firstName + " " + lastName + " has a grade point average > 2.0");
            System.out.println("Student saved to GoodStanding.txt");
         } 
         else
         {
            PrintWriter out = new PrintWriter("AcademicProbation.txt");
            out.write("ID: " + Integer.toString(id));
            out.write("\n");
            out.write("First name: " + firstName);
            out.write("\n");
            out.write("Last name: " + lastName);
            out.write("\n");
            out.write("Grade point average: " +
            Double.toString(gradePointAverage));
            out.write("\n");
            out.write("\n");
            out.close();
            System.out.println(firstName + " " + lastName + " has a grade point average < 2.0");
            System.out.println("Student saved to AcademicProbation.txt");
         }
            System.out.println("Continue? y for yes, or n for no.");
            System.out.print("Answer: ");
            String answer = bufferedReader.readLine();
            if (answer.equals("y"))
            {
               System.out.println("");
            }
            else if (answer.equals("n"))
             {
               scanner.close();
               isWorking = false;
             }
             if (gradePointAverage >= 3.5)
             {
               BufferedReader input = new BufferedReader(new FileReader("GoodStanding.txt" ));
               String line1 = input.readLine( );
               String line2 = input.readLine( );
               input.close( );
               System.out.println(line2 + " is on the Dean's list!");
             }            
             
      }
         
   }
}
