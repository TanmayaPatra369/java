// Write a program to print the corresponding grade for the given mark using if..else statement in Java.

class grade
{
public static void main (String[] args)

 {
  int i=85;

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
