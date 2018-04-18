import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class TestGrade {



	public static void main(String[] args) throws Exception
	{
		int[] studentID= {12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
		String[] studentGrade= {"0","0", "0","0", "0", "0", "0", "0", "0", "0"};
		String[] validGrades={"A", "B", "C", "D", "F", "I"};
		String inString,outString = ""; 
		boolean isValid;

		String error = new String();

		Scanner input=new Scanner(System.in);
	
		for (int i=0; i < studentID.length;  i++ )
		{
			System.out.println("Enter grade for " + studentID[i]);
			studentGrade[i]=input.next();
		
			
			try
			{
				for (int x=0; x<validGrades.length; x++)
			{
				if (studentGrade[i]==validGrades[x])
					{
						 isValid=true;
					
					}
				 isValid=false;
				
			}
			
		
	

		for (int y=0; y<studentID.length; y++)
		{
			System.out.println("Student " + studentID[y]+ " has grade " + studentGrade[y]+ "\n");
			
		}
					
				if (isValid=false)
				{
					
					error= studentGrade[i] + " is invalid.";
					throw (new GradeException(error));
				}
				
			
				
			}
			catch (GradeException something)
			{
				JOptionPane.showMessageDialog(null, something.getMessage());
				studentGrade[i] = "I";
			}
			
			
		}
      }
	
   }	
  