import java.util.Scanner;

public class CalculateX {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("where does x start?: ");
		Scanner in = new Scanner(System.in);
		double InitialX = in.nextDouble();
		System.out.println("where does x stop?: ");
		 
		double LastX = in.nextDouble();
		
		double X = LastX - InitialX;
		System.out.println(" the value of x is " + X );
		System.out.println();
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		// TODO Auto-generated method stub
		
	}

}
