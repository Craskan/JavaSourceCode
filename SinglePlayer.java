import java.util.Scanner;


public class SinglePlayer 
{

			/**
			 * @param args this is a single player space battle
			 * 
			 *  
			 *
			 */
			public static void main(String[] args) 
			{
				int winnerDeterment = 0;
				System.out.println("Briefing: The Universal Empire and the Intergalatic Empire are at war!");
				System.out.println("You are a Starship commander for the Universal Empire and must destroy all opposing Starships.");
				System.out.println("You will be firing the newest Gama-Thrash missle, this incredibly powerful");
				System.out.println("and smart missle is sometimes able to find and destoy it's objective even when it is");
				System.out.println("several light years off target.  The missles you will be firing can cost more than the");
				System.out.println("annual productivity of several PLANETS! Aim carefully.  The Starships of the Universal Empire");
				System.out.println("are called 'ships' and the Starships for the Intergalatic Empire are called 'targets'");
				System.out.println("to destroy your oppenent correctly enter in his co-ordinates when it is your turn to fire.");
				
				System.out.println();
				//prompt these inputs get the starting locations of both spaceships
				int shipx = startNow(1);
				int shipy = startNow(1);
				int shipz = startNow(1);
				int targetx = startNow(1);
				int targety = startNow(1);
				int targetz = startNow(1);
				//System.out.println(shipx +" , "+shipy +" , "+shipz + " , "+targetx +" , "+targety+" , "+targetz);
				
				//this array stores the initial values of the ship's location
				//this array is what is referenced when the program calls previous position
				//this array is updated near the end of method main.
				int ship[] = new int [1000];
				ship[1] = shipx;
				ship[2] = shipy;
				ship[3] = shipz;
				
				//this array stores the initial values of the target's location
				//this array is what is referenced when the program calls previous position
				//this array is updated near the end of method main.
				int target[] = new int [1000];
				target[1] = targetx;
				target[2] = targety;
				target[3] = targetz;
				
				//this loop will continue to run while the game lasts
				boolean game = true;
				while (game == true)
				{
				//this section of inputs will be stored in array move ship, these
				//inputs will tell the program how much to move the ship.
				System.out.println("Ship Commander, how far would you like to move along the x axis(10,5,-5,or-10): ");
				int shipMovex = move(1);
				System.out.println("Ship Commander, how far would you like to move along the y axis(10,5,-5,or-10): ");
				int shipMovey = move(1);
				System.out.println("Ship Commander, how far would you like to move along the z axis(10,5,-5,or-10): ");
				int shipMovez = move(1);
				
				//a number of these arrays could simply be represented with
				//variables but I found it easier to keep track of a single array
				//over multiple variables.  this array stores the values of how far it should
				//move
				int moveShip[] = new int [1000];
				
				moveShip[1] = shipMovex;
				moveShip[2] = shipMovey;
				moveShip[3] = shipMovez;
				
				//haven't I described enough already, HMMMMMMMMPFH!
				//The array ship keeps track of the ships old position
				//this array newShip keeps track of the current position.
				int newShip[] = new int [1000];
				
				//these values are where the ship is currently located
				newShip[1] = ship[1]+ shipMovex;
				newShip[2] = ship[2]+ shipMovey;
				newShip[3] = ship[3]+ shipMovez;
				
				//this section of inputs will be stored in array move the target, these
				//inputs will tell the program how much to move the ship.

				int targetMovex = computerMove(1);
				int targetMovey = computerMove(1);
				int targetMovez = computerMove(1);
				
				//this array keeps track of the values of how far the target will move in
				//a given turn.  these values are refreshed every turn until the game ends.
				int moveTarget[] = new int [1000];
				//actual values of how target will move
				moveTarget[1] = targetMovex;
				
				moveTarget[2] = targetMovey;
				
				moveTarget[3] = targetMovez;
				//this array current position of target
				int newTarget[] = new int [1000];
				
				//actual values of target
				newTarget[1] = target[1] + moveTarget[1];
				newTarget[2] = target[2] + moveTarget[2];
				newTarget[3] = target[3] + moveTarget[3];
				
				//ship firing sequence
				System.out.println("It is the Ship's turn to fire to at the target");
				
				System.out.println("The target's previous co-ordinate's were " + target[1] + " x " + target[2] + " y " + target[3] + " z ");
				int Aim[] = Fire(1000);
				 
				
				
				//this for statement handles the spread effect
				for (int i = 0;i<5;i++)
			{
				if (Aim[1] == newTarget[1] && Aim[2] == newTarget[2] && Aim[3]== newTarget[3] )
				{
					game = false;
					System.out.println();
					System.out.println("Target totally terminated");
					System.out.println("if the target is able to shoot the ship in it's next shot the game is a tie.");
					System.out.println();
					i = 5;
					//determineWinner(1);
					winnerDeterment =2;
				}
				else if (i == 0)
				{
					
					Aim[1]=Aim[1] + 5;
					
					if(Aim[1] == target[1] || Aim[1] >= target[1] + 15 || Aim[1] <= target[1] - 15)
					{
						Aim[1] = target[1]-computerMove(1);
					}
					
					if (Aim[3] == target[3] || Aim[3] >= target[3] + 15 || Aim[3] <= target[3] - 15)
					{
						Aim[3]= target[3]+computerMove(1);
					}
					if(Aim[2] == target[2] || Aim[2] >= target[2] + 15 || Aim[2] <= target[2] - 15)
					{
						Aim[2]= target[2]+computerMove(1);
					}
					
				}
				else if (i == 1)
				{
					Aim[1]=Aim[1]-5;
					Aim[3]=Aim[3]-5;
					
					if (Aim[1] == target[1] || target[1] >= target[1] + 15 || Aim[1] == target[1] - 15)
					{
						Aim[1]=target[1]-computerMove(1);
					}
					
				}
				else if (i ==2)
				{
					Aim[3]=Aim[3]+10;
					
					if(Aim[3] == target[3] || Aim[3] >= target[3] + 15 || Aim[3] == target[3] - 15)
					{
						Aim[3]=target[3]+computerMove(1);
					}
						
				}
				else if (i == 3)
				{
					Aim[3]=Aim[3]-5;
					Aim[2]=Aim[2]-5;
					
					if(Aim[2] == target[2] || Aim[2] >= target[2] + 15 || Aim[2] == target[2] - 15)
					{
						Aim[2] = target[2]-computerMove(1);
					}
					
				}
				else if (i==4)
				{
					Aim[2]=Aim[2]+ 10;
					
					if(Aim[2] == target[2] || Aim[2] >= target[2] + 15 || Aim[2] <= target[2] - 15)
					{
						Aim[2] = target[2] + computerMove(1);
					}
					
				}
			}
				//target's firing sequence
				//System.out.println("It is the Target's turn to fire at the ship");
				
				//System.out.println("The Ship's previous co-ordinate's were " + ship[1] + "x " + ship[2] + " y " + ship[3] + " z ");
				int Aim2[] = computerFire(10000);
				Aim2[1] = Aim2[1] + ship[1];
				Aim2[2] = Aim2[2] + ship[2];
				Aim2[3] = Aim2[3] + ship[3];
				//this for statement handles the missles spread effect
				for (int p = 0;p<5;p++)
			{
					
					if (Aim2[1] == newShip[1] && Aim2[2] == newShip[2] && Aim2[3]== newShip[3] )
				{
					
					game = false;
					
					System.out.println("Ship suddenly sucombed to superior shot: game over");
					
					
					p=5;
					//determineWinner(2);
					winnerDeterment = winnerDeterment + 1;
				}
				else if (p == 0)
				{
					
					int movement[] = computerFire(10000);
					movement[1] = movement[1] + ship[1];
					movement[1] = movement[2] + ship[2];
					movement[1] = movement[3] + ship[3];
					
					
				}
				else if (p == 1)
				{
					
					int movement[] = computerFire(10000);
					movement[1] = movement[1] + ship[1];
					movement[1] = movement[2] + ship[2];
					movement[1] = movement[3] + ship[3];
					
				}
				else if (p ==2)
				{
					int movement[] = computerFire(10000);
					movement[1] = movement[1] + ship[1];
					movement[1] = movement[2] + ship[2];
					movement[1] = movement[3] + ship[3];
					
				}
				else if (p == 3)
				{
					int movement[] = computerFire(10000);
					movement[1] = movement[1] + ship[1];
					movement[1] = movement[2] + ship[2];
					movement[1] = movement[3] + ship[3];
					
				}
				else if (p==4)
				{
					int movement[] = computerFire(10000);
					movement[1] = movement[1] + ship[1];
					movement[1] = movement[2] + ship[2];
					movement[1] = movement[3] + ship[3];
					
				}
				
			}
				//this makes the last co-ordinates current
				ship[1]=newShip[1];
				ship[2]=newShip[2];
				ship[3]=newShip[3];
				target[1]=newTarget[1];
				target[2]=newTarget[2];
				target[3]=newTarget[3];
			}
				if (winnerDeterment == 2)
				{
					System.out.println("The ship commander is the WINNER! congratulations champ!");
					System.out.println("Once more the Universal Empire has vanquished it's enemies!");
					
				}
				else if (winnerDeterment == 1)
				{
					System.out.println("The target commander is the WINNER! congratulations champ!");
					System.out.println("The Intergalatic Empire Thanks you, and gives your Starship a free upgrade!");
				}
				else if (winnerDeterment == 3)
				{
					System.out.println("Both Starships were destroyed, this game was a tie");
				}
				//final comment
				System.out.println();
				System.out.println("Thank you for using Kemp media(c)software, I hope this game has been fun.");
				System.out.println("For any questions, comments or concerns, you can reach one of are staff");
				System.out.println("by e-mailing calebkemp1@gmail.com.");	
			}
				// TODO Auto-generated method stub

			//this method is called to get the ship and target's starting location	
			public static int readInputs(int numberOfInputs)
			{
				
				int shipLocation = numberOfInputs;
				//although this seems unnecessary if this value was not initialized here
				//the boolean would automatically be set to false
				boolean yes = true;
				while (yes = true)
				{
				Scanner in = new Scanner(System.in);
				shipLocation = in.nextInt();
				if (shipLocation % 5 == 0)
					{
					yes = false;
					return shipLocation;
					}
				//if an integer that is not divisible by five is allowed the users will
				//never be able to hit his enemy 
				else if (shipLocation % 5 != 0) 
					{
					System.out.println("invalid move, it must be an integer divisible by 5: ");
					yes = true;
					}
				
				}
				yes = false;
				return shipLocation;
				
			}
			//this takes care of the firing sequence, I think it's pretty cool!!!
			public static int[] Fire(int coordinates)
			{
				//gathers the coordinates that the user is firing at
				System.out.println("what do you think the x co-ordinate is?: ");
				int firex = readInputs(1);
				System.out.println("what do you think the y co-ordinate is?: ");
				int firey = readInputs(1);
				System.out.println("what do you think the z co-ordinate is?: ");
				int firez = readInputs(1);
				//all the values are stored in this variable so that it all
				//can be returned with just one method
				int total[] = new int [10000];
				total [1] = firex;
				total [2] = firey;
				total [3] = firez;
				return total;
			
			}

			//this method first checks to make sure the input is a valid
			//integer, then it gathers all the values into an array and sends it 
			//back to the method where it will be used to reposition a given spaceships
			//position
			public static int move(int spaces)
			{
				int movement = spaces;
				boolean yes = true;
				while (yes = true)
				{
				 movement = spaces;
				Scanner in = new Scanner(System.in);
				movement = in.nextInt();
				//these are the only allowed move values
				if (movement == 10 || movement == 5 || movement == -5|| movement ==-10)
					{
					yes = false;
					return movement;
					}
				else if (movement % 5 != 0) 
					{
					System.out.println("Invalid move, it must be an integer one of the following integers(5,10,-5,10): ");
					yes = true;
					}
				else
				{
					System.out.println("Invalid move, the integer cannot exceed + or - 10: ");
				}
				
				}
				yes = false;
				return movement;
				
			}
			public static int startNow(int w)
			{
				int newCoordinate = w;
				newCoordinate = (int)(Math.random()*100)-100;
				newCoordinate = newCoordinate * 5;
				return newCoordinate;
			}
			public static int computerMove(int w)
			{
				int negativeOrPositive = w;
				negativeOrPositive =(int)(Math.random()*2)+1;
				if (negativeOrPositive % 2 == 0)
				{
					//positve
					
					int divider = (int)(Math.random()*2)+1;
						if (divider % 2 == 0)
						{
							negativeOrPositive = 5;
							return negativeOrPositive;
						}
						else if (divider % 2 != 0)
						{
							negativeOrPositive = 10;
							return negativeOrPositive;
						}
					
				}
				else if (negativeOrPositive % 2 != 0)
				{
					//negative
					
					int divider = (int)(Math.random()*2)+1;
					if (divider % 2 == 0)
					{
						negativeOrPositive = -5;
						return negativeOrPositive;
					}
					else if (divider % 2 != 0)
					{
						negativeOrPositive = -10;
						return negativeOrPositive;
					}
				}
				return negativeOrPositive;
				
			}
			public static int[] computerFire(int d)
			{
				int autoPilot[] = new int [d];
				autoPilot[1] = computerMove(1);
				autoPilot[2] = computerMove(1);
				autoPilot[3] = computerMove(1);
				return autoPilot;
				
			}
			
			

			

		}	
		// TODO Auto-generated method stub

	


