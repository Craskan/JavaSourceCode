import java.util.Scanner;

public class ProjectileRangeFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the projectile's initial velocity in meters per second?:  ");
		double initialVelocity = in.nextDouble();
		System.out.println("In degrees at what angle was this released?:  ");
		double degreeAngle = in.nextDouble();
		double radAngle = (degreeAngle*Math.PI)/180;
		final double GRAVITY = 9.8;
		double range = ((initialVelocity*initialVelocity)/GRAVITY)*Math.sin((2*radAngle));
		double velocityAsFcnOfAngle = initialVelocity*(Math.sin(radAngle));
		System.out.println("velocity as a fnc of angle = "+velocityAsFcnOfAngle);
		double maxHeight = (velocityAsFcnOfAngle*velocityAsFcnOfAngle)/(2*GRAVITY);
		
		//this is so it will only keep to three decimals
		//the 0.5 is so the last decimal will round to the nearest number
		//not just round down
		range = (int)((range*1000)+0.5);
		range = (double)range;
		range = range/1000;
		System.out.println("The max height it would rise is "+ maxHeight+ " meters");
		System.out.println("the projectile will travel "+range+ " meters if air resistance is neglected");
		System.out.println();
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		
		// TODO Auto-generated method stub

	}

}
