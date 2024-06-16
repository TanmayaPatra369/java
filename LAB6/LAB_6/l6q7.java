

import java.util.Scanner;

class l6q7{
	class negexception extends Exception {
		private int detail;

		negexception(int a){
			detail = a;
		}
		public String toString()
		{
			return "NegativeException["+detail+"]";
		}
	}
	public int processinput(int x) throws negexception
	{
			if(x<0)
			throw new negexception(x);

		int dble = 2*x;
		return dble;
	}
	public static void main(String[] args)
	{
		try {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to double : ");
				int x = sc.nextInt();
			l6q7 dbl = new l6q7();
			System.out.println("value after being doubled : " + dbl.processinput(x));
		}
	}
	catch(negexception  e)
	{
		System.out.println("caught : " + e);
	}
	}
}