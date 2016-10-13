import java.util.Scanner;

public class FindingFinalVelocityOfProjectile {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the projectile's intitial velocity in meters");
		System.out.print("per second?:  ");
		double initialVelocity = in.nextDouble();
		System.out.println("How far does the projectile fall in meters?:  ");
		double height = in.nextDouble();
		double initialVelocitySquared = squared(initialVelocity);
		final double FORCEOFGRAVITY = 9.8;
		double velocityDueToGravity = 2*FORCEOFGRAVITY*height;
		double finalVelocity = Math.sqrt((velocityDueToGravity+initialVelocitySquared));
		//this is so it will only keep to three decimals
		//the 0.5 is so the last decimal will round to the nearest number
		//not just round down
		finalVelocity = (int)((finalVelocity*1000)+0.5);
		finalVelocity = (double)finalVelocity;
		finalVelocity = finalVelocity/1000;
		System.out.println("your final velocity is " + finalVelocity+" meters per second!");
		System.out.println();
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		// TODO Auto-generated method stub

	}



public static double squared (double x)
{
	double f = x;
	return f*f;
}
}