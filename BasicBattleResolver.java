import java.util.Scanner;

public class BasicBattleResolver {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		/*program resolves single roll, if battle over, displays results
		 * and asks user if he would like to do another battle.  If conflict
		 * unresolved the user is asked if he would like to continue the 
		 * attack.  If no, the user will be asked if he would like to 
		 * do another battle. if no the program exits.
		*/
		boolean battle = false;
		
		
		
		
		int maxDefenders = 2;
		int variables[] = gainInput();
		int [] combatDefenders = new int [maxDefenders];
		int [] combatAttackers = new int [variables[2]];
		
		
		int[]lossesTaken = new int [maxDefenders];
		
		while (battle == false)
		{
			int attackerDice[] = rollDice(variables[2]);
			combatAttackers = findingOrder(attackerDice,variables[2]);
			int defenderDice[] = new int[maxDefenders];
		
		if (variables[1] > 1)
		{
			defenderDice = rollDice(maxDefenders);
			combatDefenders = findingOrder(defenderDice,maxDefenders);
		}
		else if (variables[1] == 1)
		{
			maxDefenders = 1;
			defenderDice = rollDice(maxDefenders);
			combatDefenders = findingOrder(defenderDice,maxDefenders);
		}
		int howManyRollsCompared = howManyDiesCompared(maxDefenders, variables[2]);
		lossesTaken = lossesTaken(howManyRollsCompared,combatAttackers,combatDefenders);
		variables[0]= variables[0]- lossesTaken[0];
		variables[1]= variables[1]-lossesTaken[1];
		int tracker = determineIfWinner(variables[0],variables[1]);
		
		if (tracker == 0)
		{
			battle = true;
		}
		else if (tracker == 1)
		{
			battle = true;
		}
		/*else if(tracker == 2)
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Would you like to continue attacking yes(1), no(2): ");
			int decision = in.nextInt();
			
			if (decision == 2)
			{
				battle = true;
			}
		}*/	
	}
	}	 
		
		
		
		
		
		// TODO Auto-generated method stub

	
	public static int[] gainInput()
	{
		int[] variables = new int[3];
		Scanner in = new Scanner(System.in);
		attackScript();
		variables[0] = in.nextInt();
		defendScript();
		variables[1] = in.nextInt();
		numberOfDice();
		int dieCheck = in.nextInt();
		//check works much like a boolean in this instance.
		int check = 0;
		while(check!=1)
		{
			if (dieCheck >= variables[0] || dieCheck < 1||dieCheck > 3)
			{
				System.out.println("You must roll between 1-3 dice, and have at least 1 more attacker than");
				System.out.println("the number of dice to be rolled.");
				numberOfDice();
				dieCheck = in.nextInt();
			}
			else if(dieCheck < variables[0] & dieCheck > 0 & dieCheck <= 3)
			{
				check = 1;
				//System.out.println("made it this far-");
			}
		}
		variables[2] = dieCheck;
		//System.out.println("k"+variables[2]+"k");
		return variables;
	}
	public static void attackScript()
	{
		System.out.println("How many armies are in the attacking territory?: ");
	}
	public static void defendScript()
	{
		System.out.println("How many armies are in the defending territory?: ");
	}
	public static void numberOfDice()
	{
		System.out.println("How many dies is the attacker rolling?: ");
	}
	public static int[] rollDice(int k)
	{
		int dieSides = 6;
		int[] rollDice = new int[k];
		for(int i = 0;i<k;i++)
		{
			rollDice[i]=(int)(Math.random()*dieSides)+1;
			//System.out.println("die "+i+" is "+ rollDice[i]);
		}
		return rollDice;
	}
	public static int[] findingOrder(int[] x,int k)
	{
		int [] order = new int[k];
		if(k == 3)
		{
			if(x[0]>=x[1]&x[0]>=x[2])
			{
				if(x[1]>=x[2])
				{
				order[0]=x[0];
				order[1]=x[1];
				order[2]=x[2];
				//System.out.println("used 1-1");
				}
				else 
				{
				order[0]=x[0];
				order[1]=x[2];
				order[2]=x[1];
				//System.out.println("used 1-2");
				}
			}	
			else if(x[1]>=x[0]&x[1]>=x[2])
			{
				if(x[0]>=x[2])
				{
				order[0]=x[1];
				order[1]=x[0];
				order[2]=x[2];
				//System.out.println("used 2-1");
				}
				else
				{
				order[0]=x[1];
				order[1]=x[2];
				order[2]=x[0];
				//System.out.println("used 2-2");
				}
			}	
			else if(x[2]>=x[0]&x[2]>=x[1])
			{
				if(x[0]>=x[1])
				{
				order[0]=x[2];
				order[1]=x[0];
				order[2]=x[1];
				//System.out.println("used 3-1");
				}
				else 
				{
				order[0]=x[2];
				order[1]=x[1];
				order[2]=x[0];
				//System.out.println("used 3-2");
				}
			}	
		}
		else if(k==2)
		{
			if(x[0] >= x[1])
			{
			order[0]= x[0];
			order[1]= x[1];
			//System.out.println("used 11-1");
			}
			
			else 
			{
			order[0]=x[1];
			order[1]=x[0];
			//System.out.println("used 11-2");
			}
		}
		else if(k==1)
			{
				order[0]=x[0];
				//System.out.println("used 111-1");
			}
					
		return order;
	
		
	}
	public static int howManyDiesCompared(int d, int r)
	{
		int diesCompared = 0;
		if((r+d)<= 3)
		{
			diesCompared = 1;
		}
		else if ((r+d)==4 & r>d)
		{
			diesCompared = 1;
		}
		else 
		{
			diesCompared = 2;
		}
		return diesCompared;
	}
	public static int[] lossesTaken(int diesCompared,int[]attackerRoll,int[]defenderRoll)
	{
		//losses [0] equals attacker losses, losses[1] equals defender losses.
		int []losses = new int[2];
		//System.out.println("dies " +diesCompared);
		for (int i = 0; i < diesCompared;i++)
		{
			if (attackerRoll[i]>defenderRoll[i])
			{
				losses[1]= losses[1]+1;
			}
			else
			{
				losses[0]=losses[0]+1;
			}
		//System.out.println("defender "+defenderRoll[i]+ "attacker "+ attackerRoll[i]);
		}
		
		
		return losses;
		
		
	}
	public static int determineIfWinner(int attack,int defend)
	{
		int tracker = 0;
		if (defend ==0)
		{
			System.out.println("The attacker captures the square with "+(attack-1)+" men");
			
		}
		else if (attack < 2)
		{
			
			System.out.println("The defenders held off the attackers and have "+ defend +" remaining");
			tracker = 1;
		}
		else
		{
			System.out.println("There are "+attack+ " attackers and "+defend+" defenders remaining");
			tracker = 2;
		}
		return tracker;
	}

}
