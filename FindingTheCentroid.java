import java.util.Scanner;

public class FindingTheCentroid {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many data points are there?:  ");
		int dataPoints = in.nextInt();
		double xFinal[]=new double[dataPoints];
		double yFinal[]=new double[dataPoints];
		double massFinal[]=new double[dataPoints];
		double totalX = 0;
		double totalY = 0;
		double totalMass = 0;
		
		
		for (int i = 0;i<dataPoints;i++)
		{
			xFinal[i]=findX();
			yFinal[i]=findY();
			massFinal[i]=findMass();
		}
		
		for (int i = 0;i<dataPoints;i++)
		{
			double sumX = xFinal[i]*massFinal[i];
			totalX = sumX + totalX;
		}
		
		for (int i = 0;i<dataPoints;i++)
		{
			double sumY = yFinal[i]*massFinal[i];
			totalY = sumY + totalY;
		}
		
		for (int i = 0;i<dataPoints;i++)
		{
			double sumMass = massFinal[i]*massFinal[i];
			totalMass = sumMass + totalMass;
		}
		
		double centroidX = totalX/totalMass;
		double centroidY = totalY/totalMass;
		
		//System.out.println("X's centroid is located at"+centroidX);
		//System.out.println("Y's centroid is located at"+centroidY);
		System.out.println("the total mass of the system is "+totalMass);
		System.out.print(" with the centroid at ("+centroidX+","+centroidY+")");
		
		
		// TODO Auto-generated method stub

	}
	public static double findX()
	{
		System.out.println("What is x's co-ordinate?:  ");
		Scanner in1 = new Scanner(System.in);
		double x = in1.nextDouble();
		return x;
	}
	
	public static double findY()
	{
		System.out.println("What is y's co-ordinate?:  ");
		Scanner in1 = new Scanner(System.in);
		double y = in1.nextDouble();
		return y;
	}
	
	public static double findMass()
	{
		System.out.println("What is the co-ordinate's mass?:  ");
		Scanner in1 = new Scanner(System.in);
		double mass = in1.nextDouble();
		return mass;
	}
	

}
