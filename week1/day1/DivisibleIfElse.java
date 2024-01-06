package week1.day1;

public class DivisibleIfElse {

	public static void main(String[] args)
	{
		int a = 24;
		if (a % 2 == 0) 

		{System.out.println("number a is even");

		if (a % 6 == 0)
		{System.out.println("number a is divisible by 6");
		}
		else
		{System.out.println("number a is not divisible by 6");
		}
		}
		else 
		{System.out.println("number a is odd");


		if (a % 3 == 0)
		{System.out.println("number a is divisible by 3");
		}
		else
		{System.out.println("number a is not divisible by 3");

		}

		}
	}
}

