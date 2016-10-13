import java.util.Scanner;

public class HowFarDidXTravel {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("What is x's velocity meters per second (numbers only)");
		Scanner in = new Scanner(System.in);
		double VelocityX = in.nextDouble();
		System.out.println("What is x's time in seconds (numbers only)");
		double TimeX = in.nextDouble();
	
		double X = VelocityX * TimeX;
		System.out.println("x traveled " + X + " meters");
		System.out.println();
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		// TODO Auto-generated method stub

	}

}
