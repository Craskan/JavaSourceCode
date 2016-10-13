import java.util.Scanner;

public class SAandVolumefinder {

	/**
	 * @param args this is a cool program that let's the user 
	 * input a radius and a height and the program will print out 
	 * the volume of a sphere with that radius, the surface area of
	 * a sphere with that radius.  The volume of a cylinder with the 
	 * inputed height and a base with the inputed radius.  The volume
	 * of a cone with the inputed values, and even the surface area
	 * of a cylinder. It currently prints the value in meters.
	 *  
	 */
	public static void main(String[] args) 
	{
		//prompt
		System.out.println("Please enter only the digits of a radius in meters: ");
		Scanner in = new Scanner(System.in);
		double radius = in.nextDouble();
		//prompt
		System.out.println("Please enter only the digits of a height in meters: ");
		Scanner in2 = new Scanner(System.in);
		double height = in2.nextDouble();
		//the printed answers
		
		//volume of a sphere printed
		System.out.println("A sphere with a radius of " + radius + " meters, would have a volume");
		System.out.println("of aproximately "+ (int)sphereVolume(radius) + " meters cubed.");
		
		//space for clarity
		System.out.println();
		
		//surface area of a sphere printed
		System.out.println("A sphere with a radius of " + radius + " meters would have a surface area");
		System.out.println("of aproximately " + (int)sphereSurface(radius) + " meters squared.");
		
		//space for clarity
		System.out.println();
		
		//volume of a circular cylinder printed
		System.out.println("A circular cylinder with a height of " + height + " meters, and a ");
		System.out.println("radius of " + radius + " meters, would have a volume");
		System.out.println("of aproximately " + (int)cylinderVolume(radius,height)+ " meters cubed.");
		
		//space for clarity
		System.out.println();
		
		//surface area of a circular cylinder printed
		System.out.println("The surface area of the above mentioned cylinder would be");
		System.out.println("aproximately " + (int)cylinderSurface(radius,height) + " meters squared.");
		
		//space for clarity
		System.out.println();
		
		//volume of a cone printed
		System.out.println("The volume of a cone with a radius of " + radius + " meters, and ");
		System.out.println("a height of " + height + " meters, would have a volume");
		System.out.println("of aproximately " + (int)coneVolume(radius,height) + " meters cubed." );
		
		//space for clarity
		System.out.println();
		
		//final comment
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		
		
		
		// TODO Auto-generated method stub

	}
	public static double sphereVolume(double r)
	{
		final double PI = 3.1415926535;
		double sphereVolume = (4*PI*(r*r*r))/3;
		return sphereVolume;
	}
	public static double sphereSurface(double r)
	{
		final double PI = 3.1415926535;
		double surfaceAreaSphere = (4*PI*(r*r));
		return surfaceAreaSphere;
	}
	public static double cylinderVolume(double r,double h)
	{
		final double PI = 3.1415926535;
		double volumeCylinder = h*PI*(r*r);
		return volumeCylinder;
	}
	public static double coneVolume(double r, double h)
	{
		final double PI = 3.1415926535;
		double coneVolume = (h*PI*(r*r))/3;
		return coneVolume;
	}
	public static double cylinderSurface(double r, double h)
	{
		final double PI = 3.1415926535; 
		double surfaceAreaCylinder = h*(2*PI*r );
		return surfaceAreaCylinder;
	}

}
