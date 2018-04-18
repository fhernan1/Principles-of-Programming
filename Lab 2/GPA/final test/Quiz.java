import javax.swing.*;

public class Quiz {
   public static void main(String[] args) {
      char ans = ' ';
      int x, correct = 0;
      String msg, entry = "";
      boolean isGood;
      boolean entryIsValid;
      
      String [] questions = GenerateQuestions();
      char[] answers = {'A', 'B', 'A', 'C', 'A', 
                        'A', 'C', 'A', 'B', 'C' };

      for(x = 0; x < questions.length; ++x) {
         isGood = false;
         msg = "";
         while(!isGood) {
            entryIsValid = false;
            while(!entryIsValid) {
               try {
                  entry = JOptionPane.showInputDialog
                        (null,questions[x] + msg);
                  ans = entry.charAt(0);
                  if(ans != 'A' && ans != 'B' && ans != 'C')
                     throw (new IllegalArgumentException());
                  entryIsValid = true;
                  isGood = true;
               }
               catch(StringIndexOutOfBoundsException e) {
                  JOptionPane.showMessageDialog(null,
                      "No answer given. Please try again");
               }
               catch(IllegalArgumentException e) {
                  msg = "\nYour answer must be A, B or C.";
               }
            }
         }
         if(ans == answers[x]) {
            correct++;
            JOptionPane.showMessageDialog(null, "Correct!");
         } else
            JOptionPane.showMessageDialog(null, 
               "The correct answer is " + answers[x]);      
      }
      JOptionPane.showMessageDialog(null, "You got " +
         correct + " right and\n" +(questions.length -correct) +
         " wrong");
   }
   public static String [] GenerateQuestions(){
      String[] questions = 
       {"How many players on a basketball team?\nA  5\nB  6\nC  7",
         "How many points for a regulation basket?\nA  1\nB  2\nC  3",
         "Who founded the game of basketball?\nA  James Naismith\n" +
               "B  Red Auerbach\nC  Wilt Chamberlain",
         "Which of the following is a position on the basketball team?\n" +
               "A  quarterback \nB  pitcher \nC  center",
         "What is the name of Atlanta's NBA team?\n" +
               "A  Hawks   \nB  Falcons   \nC  Braves",
         "Who may ask a referee about a rule interpretation?\n" +
               "A  Team captain\n" +
               "B  A player who receives a foul\n" +
               "C  Any player on the floor",
         "Suppose a shooter from team A makes a basket\n" +
             "in team B's basket. Who gets credit for the basket?\n" +
             "A  The player who made the basket\n" +
             "B  The last player from team B who made a basket\n" +
             "C  The player from team B nearest the shooter",
         "A basketball game starts with a\n" +
             "A  Jump ball\nB  Throw in from the side\n" +
             "C  Throw in from the end",
         "To acquire the ball after a missed shot is called \n" +
             "A  foul  \nB  rebound  \nC  lay-up",
         "Taking steps with the ball without dribbling is called\n" +
               "A  Stepping  \nB  Dunking  \nC  Travelling"};
      return questions;

   }
}