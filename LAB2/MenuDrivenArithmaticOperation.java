/*Write a menu driven program for arithmetic operations ( addition, subtraction,
multiplication & division) for 2 integers using switch case.
The program will also ask the  user whether to continue or not and print the default value as invalid choice.
Use InputSTreamReader and BufferedReader*/

import java.util.*;

class MenuDrivenArithmaticOperation

{

    public static void main(String args[])

	{
		 Scanner obj = new Scanner(System.in);
            while (true)

               {    System.out.println("choose any one to perform: \n 1.addition \n 2.Substraction \n 3.MUltiplication \n 4.Division \n 5.EXIT");
                    
               int choice = obj.nextInt();

             if (choice == 5)
             {
                System.out.println("The program has been exited");
                System.exit(0);
                break;
             }
                    
             
             
                    System.out.println("enter 1st number");
                    int a= obj.nextInt();
                    System.out.println("enter 2nd number");
                    int b= obj.nextInt();

                    int sum=a+b;
                    int diff=a-b;
                    int prod=a*b;
                    float quot=a/b;



            	

                

                switch (choice)
                  {
                    case 1:
                        System.out.println("The sum of the number is" +sum);
                        break;


                    case 2:
                    System.out.println("The difference of the number is" +diff);
                    break;


                    case 3:
                        System.out.println("The product of the number is" +prod);
                        break;


                    case 4:
                    if(b != 0)
                    {
                        System.out.println("The quotient of the number is" +quot);
                        break;
                    }
                    else
                    {
                        
                        System.out.println("Denominator cannot be zero.");
                    }

                    
                    
                    
                    case 5:
                       

                    default:

                        System.out.println("enter a correct choice");
                        
                        break;    
                  }   
                  try (Scanner loop = new Scanner(System.in)) {
                    System.out.println("do you want to continue the program?(y/n)");
                      String x= loop.nextLine();
                       
                    if( )
                       {
                        main(args);
                       }
                }

                }
    }

}
