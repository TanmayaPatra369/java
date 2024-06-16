class AcceptnNumbersCommandLineArgument

{
  public static void main (String[] args)

   {        int n=0,E=0,O=0,GT=0,TE=0,TO=0;

       {


	  for (int i = 0 ; i < args.length ; i++)

   {n = Integer.parseInt(args[i]);

            if(n%2 == 0)

            {
              E=E+n;
              TE++;
            }

            else

            {
            O=O+n;
            TO++;
            }

            GT = E + O;}

	 }

	 System.out.println("The sum of even number is" +E);
	 System.out.println("The sum of odd number is" +O);
	 System.out.println("The number of even " +TE);
	 System.out.println("The number of odd" +TO);
	 System.out.println("The grand total" +GT);

   }

}