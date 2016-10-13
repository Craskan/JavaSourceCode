import java.util.Scanner;
public class CalculatingPercentError {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is the number supposed to be?:  ");
		double accepted = in.nextDouble();
		System.out.println("And what number did you get?:  ");
		double result = in.nextDouble();
		double percentError = (Math.abs(accepted-result)/accepted)*100;
		//this is so it will have no more than three decimals
		//the 0.5 is so the last decimal will round to the nearest number
		//not just round down
		percentError = (int)((percentError*1000)+0.5);
		percentError = (double)percentError;
		percentError = percentError/1000;
		System.out.println("Your percent error is "+percentError+" %");
		System.out.println();
		System.out.println("Thank you for using Kemp media(c)software, I hope this program has been helpful.");
		System.out.println("For any questions, comments or concerns, you can reach one of are staff");
		System.out.println("by e-mailing calebkemp1@gmail.com.");
		
		// TODO Auto-generated method stub

	}

}
