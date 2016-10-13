import java.util.Scanner;

public class EquationLineForLeastFitSquareMethod {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many data points are there?: ");
		int loops = in.nextInt();
		double xValue[] = dataXCollect(loops);
		double yValue[] = dataYCollect(loops);
		double sigmaXiYi = xIyISquaredSum(xValue,yValue,loops);
		//these print statements help show the steps.
		System.out.println(sigmaXiYi+" This is xi*yi sum. ");
		double sigmaXiSquared = xISquaredSum(xValue,loops);
		System.out.println(sigmaXiSquared+" This is xi^2 sum");
		double sigma_Y = ySumI(yValue,loops);
		System.out.println(sigma_Y+" This is the sum of the y values.");
		double sigma_X = xSumI(xValue,loops);
		System.out.println(sigma_X+" This is the sum of the x values.");
		double deltaChange = 0;
		double slopeM = 0;
		
		double interceptB = 0; 
		
		deltaChange = (loops *sigmaXiSquared)- sigma_X*sigma_X;
		System.out.println(deltaChange+" This is the value of delta(amount of change)");
		slopeM = ((loops*sigmaXiYi)-(sigma_X*sigma_Y))/deltaChange;
		
		interceptB = ((sigmaXiSquared*sigma_Y)-(sigma_X*sigmaXiYi))/deltaChange;
		
		System.out.println("The equation of the line is "+slopeM+" X + "+interceptB+".");

	
	}
	
	
	
	public static double [] dataXCollect(int x)
	{
		double [] xData = new double[x];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i<x;i++)
		{
			System.out.println("What is the value of X at "+ (i+1) +"?:");
			xData[i]= in.nextDouble();
		}
		return xData;
	}
	
	public static double [] dataYCollect(int y)
	{
		double [] yData = new double[y];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i<y;i++)
		{
			System.out.println("What is the value of Y at "+ (i+1) +"?:");
			yData[i]= in.nextDouble();
		}
		return yData;
	}
	public static double xIyISquaredSum (double[] x , double[] y,int loops)
	{
		double xIyI = 0;
		double xIyISum = 0;
		
		for (int i = 0;i<loops;i++ )
		{
			xIyI = x[i]* y[i];
			xIyISum = xIyISum + xIyI;
		}
		
		return xIyISum;
	}
	public static double xISquaredSum (double[] x,int loops)
	{
		double xISquared = 0;
		double xISquaredSum = 0;
		
		for (int i = 0;i<loops;i++ )
		{
			xISquared = x[i]* x[i];
			xISquaredSum = xISquaredSum + xISquared;
		}
		
		return xISquaredSum;
	}
	public static double xSumI (double[] x,int loops)
	{
		
		double xSum = 0;
		for (int j = 0;j<loops;j++)
		{
			xSum = xSum + x[j];
			
		}
		return xSum;
	}
	public static double ySumI (double[] y,int loops)
	{
		
		double ySum = 0;
		for (int j = 0;j<loops;j++)
		{
			ySum = ySum + y[j];
			
		}
		return ySum;
	}
	
		// TODO Auto-generated method stub

	

}
