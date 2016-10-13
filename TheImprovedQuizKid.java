import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.net.URL;
import java.util.Scanner;
public class TheImprovedQuizKid 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("How large of an array would you like to fill with random numbers");
		Scanner in = new Scanner(System.in);
		int length = 10;//in.nextInt();
		String questions[] = partnerList();
		String questions2[] = secondList();
		String options2[] = secondListOptions();
		int alreadyFilled[] = fillArray(length);
		System.out.println("");
		for (int i = 0; i< length;i++)
		{
		
		System.out.println(questions2[alreadyFilled[i]]);
		System.out.println(options2[alreadyFilled[i]]);
		System.out.println("");
		}
		
		
	}
	public static String[] partnerList()
	{
		String[] budds ={
		"                ",
		"Meagan A.       ",
		"Melinda Allen   ",
		"Linda Baez      ",
		"Taj Barnett     ",
		"Anita           ",
		"Sarah Etter     ",
		"Paola Fuentelsaz",
		"Jen Gordman     ",
		"Mary Herdman    ",
		"Shane Honaker   ",
		"Michelle Hunter ",
		"Chrissy Keiser  ",
		"Cody Kemp       ",
		"Artur Kokeneski ",
		"Tenisha Martinet",
		"Margie Miller   ",
		"Jacob Myers     ",
		"Nadia Shakia    ",
		"Leo Tarango     ",
		"Kristen Ward    ",
		"Beth Queen      ",
		"Kristina Fisher ",
		"Shannon HC      "};
		return budds;
	}
	public static String[] partnerListOptions()
	{
		String[] budds ={
		"                ",
		"Meagan A.       ",
		"Melinda Allen   ",
		"Linda Baez      ",
		"Taj Barnett     ",
		"Anita           ",
		"Sarah Etter     ",
		"Paola Fuentelsaz",
		"Jen Gordman     ",
		"Mary Herdman    ",
		"Shane Honaker   ",
		"Michelle Hunter ",
		"Chrissy Keiser  ",
		"Cody Kemp       ",
		"Artur Kokeneski ",
		"Tenisha Martinet",
		"Margie Miller   ",
		"Jacob Myers     ",
		"Nadia Shakia    ",
		"Leo Tarango     ",
		"Kristen Ward    ",
		"Beth Queen      ",
		"Kristina Fisher ",
		"Shannon HC      "};
		return budds;
	}
	public static String[] secondList()
	{
		String[] budds ={
		"                ",
		"could I if I was as good as gold!!         ",
		"If I was an elephant, would you give me free peanuts       ",
		"Couldn't I please, pretty please       ",
		"can we watch just one more!!!       ",
		"can we have a puppy       ",
		"can I have a cookie       ",
		"how old are you ",
		"how tall are you       ",
		"how fat are you        ",
		"are you married ",
		"are you sure    ",
		"how many kids do you have  ",
		"is santa real   ",
		"why are clouds white ",
		"are there horses in heaven",
		"are we there yet   ",
		"could I have a hundred dollars     ",
		"how come I can't come    ",
		"my cereal is mushy, how come     ",
		"Kristen Ward    ",
		"Beth Queen      ",
		"Kristina Fisher ",
		"Shannon HC      "};
		return budds;
	}
	public static String[] secondListOptions()
	{
		String[] budds ={
		"                ",
		//could I if I was as good as gold!!
		"1..maybe, 2..why of course, 3..NEVER, 4..only if it was pure gold",
		//If I was an elephant, would you give me free peanuts
		"1..I'm afraid not, 2..well, if you were a SMALL elephant, 3..honey, your allergic to peanuts, 4.. yes dear",
		//Couldn't I please, pretty please
		"1..you heard your mother, 2..why not, 3..if you bother me once more, 4. oh course not, there bad for little girls",
		//can we watch just one more!!!
		"1..you've already watched every movie in the house, 2..no, 3..don't you think it's past your bedtime, 4..why not",
		//can we have a puppy
		"1..we don't have room, 2..we can't afford one, 3..puppies make your daddy sick, 4..I think we should get five",
		//can I have a cookie
		"1..ask your father, 2..ask your mother, 3..yes, 4..not on your life(that means NO!!!)",
		//how old are you
		"1..honey, that's a question you don't ask adults, 2..21, 3..old enough to TAN your HIDE!!, 4..I can't remember",
		//how tall are you
		"1..about 5'8,why?, 2..not to tall, 3..I don't know, 4..you making fun of me!",
		//how fat are you
		"1..my parents would spank me for saying that., 2..I wieigh about 110 pounds, 3..a lot thinner than the person stuffing himself with cake!!",
		"are you married ",
		"are you sure    ",
		"how many kids do you have  ",
		"is santa real   ",
		"why are clouds white ",
		"are there horses in heaven",
		"are we there yet   ",
		"could I have a hundred dollars     ",
		"how come I can't come    ",
		"my cereal is mushy, how come     ",
		"Kristen Ward    ",
		"Beth Queen      ",
		"Kristina Fisher ",
		"Shannon HC      "};
		return budds;
	}
	public static int[]fillArray(int Last)
	{
		int counter = Last;
		int remove= Last;
		int arrayKeep[] = new int [Last];
		int pullFrom[] = new int [Last];
		for(int i =0;i<Last;i++)
		{
			pullFrom[i]=i+1;
		}
		
		for (int i = 0; i < Last;i++ )
		{
			int randomNum = (int)(Math.random()*remove)+0;
			
			arrayKeep[i]= pullFrom[randomNum];
			pullFrom[randomNum]=pullFrom[remove-1];
			remove--;
			if (arrayKeep[i]==1)
			{
				counter = i;
			}
		}
		System.out.println();
		System.out.println("the number (1) is located at array alreadyFilled ["+(counter+1)+"] ");
		return arrayKeep;
	}
}