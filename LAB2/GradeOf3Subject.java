import java.util.*;

class GradeOf3Subject

{
public static void main (String[] args)

 {

   try (Scanner obj = new Scanner(System.in)) {
    System.out.println("Enter 1st subject marks");
	     int x=obj.nextInt();
	     System.out.println("Enter 2nd subject marks");
	     int y= obj.nextInt();
	     System.out.println("Enter 3rd subject marks");
	     int z= obj.nextInt();
	     int i = ((x+y+z)/3) ;

     if (i>90 && i<=100)

        System.out.println("Grade is O");

      else if (i>80 && i<=90)
        {
         System.out.println("Grade is E");
     }

      else if (i>70 && i<=80)
        {
         System.out.println("Grade is A");
     }

     else if (i>60 && i<=70)
        {
         System.out.println("Grade is B");
     }

     else if (i<=60)
        {
         System.out.println("Grade is F");
     }

     else
     {
     System.out.println("INVALID MARKS");
     }
  }
  }
 }
