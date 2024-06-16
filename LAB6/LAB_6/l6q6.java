

class l6q6{
	public static void main(String[] args)
	{
		int[] arr = {10, 0, 8, 5, 3};
		try
		{
			int r = arr[0]/arr[1];
			System.out.println(r);

			System.out.println(arr[10]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("EXCEPTION FOUND: " + e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.print("EXCEPTION FOUND: " + e);
	}
	finally{
		System.out.println();
		System.out.println("The block is still running even after an exception");
	}
}
}