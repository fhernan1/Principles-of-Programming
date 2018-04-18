public class TestGrade
{
   int id;
   String grade;
   TestGrade(int id,String grade)
   {
      this.id=id;
      this.grade=grade;
   }
public int getId()
{
    return id;
}

public String getGrade()
{
    return grade;
}
public static void main(String args[]) throws Exception
{
   ArrayList<TestGrade> list = new ArrayList<TestGrade>();
   Scanner input = new Scanner(System.in);
   int ide;
   String grade="";
   String grades[] ={"A","B","C","D","F","I"};
   List l = Arrays.asList(grades);
   for(int i = 0; i < 2; i++)
   {
   System.out.println("Enter Student id: ");
   ide=input.nextInt();
   System.out.println("Enter the grade for the above student id number:");
   grade = input.next();
   
      if(!l.contains(grade))
         {
         new GradeException("You have entered invalid grade!Re-enter Grade:");
         grade = input.next();
         }
    list.add(new TestGrade(ide,grade));
    }
    System.out.println("ID       Marks");
         for (TestGrade test : list)
            {
            System.out.println(test.getId()+"        "+test.getGrade());
            }
      }
}