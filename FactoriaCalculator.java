import java.util.Scanner;

public class FactoriaCalculator {

	/**
	 * @param args this factorial calculator still needs some adjusting.  As of this writing
	 * the factorial calculator is not operational to any significant degree.
	 */
	public static void main(String[] args) 
	{
		System.out.println("What value factoria would you like to know?: ");
		Scanner in = new Scanner(System.in);
		int factoria = in.nextInt();
		double factoriaSum = 1;
		double sum = 1;
		int keepAccurate = 0;
		int sevenPowerTen = 0;
		int dividend = 100;
		int largeNum =0;
		int two = 0;
		int three = 0;
		int five = 0;
		int seven = 0;
		
		int n=1;
		int [] tacs = new int [factoria];
		int [] backs = new int [factoria];
		int [] pTwo = new int [factoria];
		int [] pThree = new int [factoria];
		int [] pFive = new int [factoria];
		int [] pSeven = new int [factoria];
		
		/*here;s the idea a normal calculator can only calculate factoria of integers less than 3249, however
		 * I'd like to create a program which can calculate factoria for integers of 15,000 and greater. The
		 * challenge is this, the computer is only able to calculate accurately around twenty digits which means that after
		 * twenty factoria your sunk.  So the theory is this, other so many terms divide the number by some power of ten
		 * that way the computer doesn't have to do more than it can handle.  On one attempt I created a pattern
		 * which was able to calculate 1005 factoria within a factor of ten to the power of four.  The main problem
		 * is that as the number gets huge, the front number becomes so small that it rounds it to zero.  So your
		 * result just looks like zero to some power which is not very helpful.
		 */
		 
		for (int i =0 ;i<factoria;i++)
		{
			tacs[i]=i+1;
			System.out.println("glad to see ya");
			//backs[i]=tacs[i];
			while(tacs[i]%2 == 0)
			{
				pTwo[i]=pTwo[i]+1;
				tacs[i]=tacs[i]/2;
				System.out.println("Later Gator2");
			}
			while(tacs[i]%3 == 0)
			{
				pThree[i]=pThree[i]+1;
				tacs[i]=tacs[i]/3;
				System.out.println("Later Gator3");
			}
			while(tacs[i]%5 == 0)
			{
				pFive[i]=pFive[i]+1;
				tacs[i]=tacs[i]/5;
				System.out.println("Later Gator5");
			}
			while(tacs[i]%7 == 0)
			{
				pSeven[i]=pSeven[i]+1;
				tacs[i]=tacs[i]/7;
				System.out.println("Later Gator7");
			}
			
		}
		for (int i = 0; i<factoria;i++)
		{
			sum = tacs[i];
			factoriaSum = sum*factoriaSum;
		}
		for (int i = 0; i < factoria;i++)
		{
			two = two + pTwo[i];
		}
		for (int i = 0; i < factoria;i++)
		{
			three = three + pThree[i];
		}
		for (int i = 0; i < factoria;i++)
		{
			five = five + pFive[i];
		}
		for (int i = 0; i < factoria;i++)
		{
			seven = seven + pSeven[i];
		}
		
		System.out.println("the sum is "+factoriaSum+ " times 2 to the "+two+" times 3 to the "+three+" times five to the "+ five+" times seven to the "+seven+" !!!");
		
		// TODO Auto-generated method stub

	}

}
