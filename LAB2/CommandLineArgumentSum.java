class CommandLineArgumentSum
 {
   public static void main (String[] args)
   {
      int x = Integer.parseInt(args[0]);
      int y = Integer.parseInt(args[1]);
      int z = x + y ;
      System.out.println("The sum of the integers is "+z);
  }
}