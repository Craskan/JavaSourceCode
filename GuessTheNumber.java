import java.util.Scanner;

public class GuessTheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Pick a number and the computer will try and guess it.");
		System.out.println("Please enter an integer between 1 and 100: ");
		Scanner in = new Scanner(System.in);
		boolean gameStart = false;
		boolean gameOver = false;
		while (gameOver == false)
		if (in.hasNextInt())
		{
			
			while(gameStart == false)
			{
				if(in.nextInt()>0 && in.nextInt()<101)
				{
				int number = in.nextInt();
					while(gameOver==false)
					{
					int A = 1;
					int B = 100;
					int C =pickNumber(A,B);
					System.out.println("Is the number "+C);
					gameOver = decide();
					System.out.println("Is this number to large");
					boolean size = decide();
						if(size == true)
						{
						A = number;
						}
						else if(size == false)
						{
						B = number;
						}
					
						}	
				}
				else 
				{
					System.out.println("The number must be an integer between 1 and 100");
					System.out.println("Please enter a number: ");
				}
			}
			
			
		}
		else
		{
			System.out.println("The number must be an integer");
			System.out.println("Please enter an integer between 1 and 100: ");
		}
			
		// TODO Auto-generated method stub

	}
	public static int pickNumber(int a, int b)
	{
	int x = (int)(Math.random()*(b-a+1)+a);
	return x;
		
		
	}
	public static boolean decide()
	{
		boolean done = true;
		boolean decide = false;
		Scanner in = new Scanner(System.in);
		System.out.print("if yes (1), if no (2) ");
		while (done == true)
		{
			if (in.hasNextInt())
			{
				int value = in.nextInt();
				if(value == 1)
				{
					decide = true;
					done = false;
				}
				else if (value != 1)
				{
					decide = false;
					done = false;
				}
			}
			else 
			{
				System.out.println("An integer must be inputed");
				System.out.println("Please input an integer (1) if yes, (2) if no: ");
			}
		}
		return decide;
		
	}
}
