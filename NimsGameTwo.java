import java.util.Scanner;


public class NimsGameTwo {

	/**
	 * @param args this is the game nim, rules: two players take stones away from a pile.  
	 * On a players turn, the player must take at least one stone but not more than half the pile.
	 * Object: get the other player to be unable to pick up a stone, if it is your turn and there
	 * is one stone left you lose.  ( this logic at first seems confusing since it would seem that 
	 * there is still one stone left to grab, however, the rules stipulated that a player could not 
	 * take more than half the pile.
	 * 
	 * 
	 */
	public static void main(String[] args) 
	{
		;
		
		int pileSize = (int)(Math.random()*(100-10+1)+10);
		int whoseTurn = (int)(Math.random()*2);
		int smartOrStupid = (int)(Math.random()*2);
		
		boolean gameRunning = true;
		boolean programRunning = true;
		
		System.out.println("Welcome to the world of Nim!");	
		System.out.println("Rules: two players take stones from the a pile, if it is your turn and there");
		System.out.println("is only one stone left you lose. ");
		
		
		//this while loop lets the player start a new game without 
		//exiting program.  However an if statement would have to be added
		//for this to actually take place.
		while (programRunning == true)
		{
			
			//this loop makes the game continue, it loops the turns. 
			while (gameRunning == true)
			{
				
				//if it is the human's turn
				if (whoseTurn == 0)
				{
					
					//if there is only one stone left, declares winner and ends game
					if (pileSize <= 1)
					{
						
						//let's the user know who won from the human player's perspective.
						System.out.println("You lose");
						
						//end's game
						gameRunning = false;
						
						//in order for this loop(programRunning) to have any effect it should be turned 
						//into an if statement and have user input to let the user decide if the player 
						//wants to play again.
						programRunning = false;
					}
					
					//if there is more than one stone left
					else if (pileSize > 1)
					{
						
						//if the game is still running 
						int moveNotMade = 1;
						
						//if the human's turn
						while (moveNotMade == 1)
							{
							
							//humanMove;
							//prompt the human player to move
							System.out.println("how many stones would you like to take there are ");
							System.out.println(pileSize + " stones remaining: ");
							Scanner in = new Scanner(System.in);
							
							//turns the human player's input into move
							int move = in.nextInt();
								
								//if the human player is attempting to remove to many stones
								//it will continue the loop and print an error message	
								if (move > pileSize/2 || move <= 0)
								{
									System.out.println("Invalid Move");
								}
								
								//this checks if stones being removed is less than half the pile
								else if (move <= pileSize/2 && move > 0)
								{
									pileSize = pileSize - move;
									moveNotMade = 2;
								}
								
								//if it has reached this part of the code a legal move has been
								//made and this will now make the computer's turn
								whoseTurn = 1;
							}	
						
						
						
						
					}
				}
				
				//if this is true it is the computer's turn
				else if (whoseTurn == 1)
				{
					
					//if this is true it will make the smart computer move
					if(smartOrStupid == 0)
					{
						
						//if there is only one stone left, ends game and declares winner
						if (pileSize <= 1)
						{
							
							//declares who wins from the human player's perspective
							System.out.println("You Win");
							
							//ends game
							gameRunning = false;
							
							//ends program, to actually let the player chose to play another game
							//an if statement would have to be implemented controlled by user input
							programRunning = false;
						}
						//these numbers create exceptions in the smart computer algorithm
						else if ((pileSize == 63)|| (pileSize == 31)||(pileSize == 15) || (pileSize == 7) || (pileSize == 3))
						{
							
							//smartComputerMove;
							
							//math.rand was stored in a variable so it was easier to test
							int stonesGrabbed = (int)( (Math.random() * ((pileSize / 2)-1)) +1);
							//System.out.println("how much taken away? " + stonesGrabbed);
							pileSize = pileSize - stonesGrabbed;
							System.out.println("there are " + pileSize + " stones remainiing");
							//this ends the human player's turn and makes it run through the 
							//computer's turn loop
							whoseTurn = 0;
							
						}
						//if the number is greater than one it is a potentially valid move
						else if (pileSize > 1)
						{
							if (pileSize > 63)
							{
								//since the pile size starts at one hundred if the number
								//and greater than sixty-three the smart computer should
								//always (should) be able to play sixty three. this also 
								//goes for numbers 31,15,7,3 and 2.
								pileSize = 63;
								System.out.println("there are " + pileSize + " stones remainiing");
								whoseTurn = 0;
							}
							else if (pileSize > 31)
							{
								pileSize = 31;
								System.out.println("there are " + pileSize + " stones remainiing");
								whoseTurn = 0;
							}
							else if (pileSize > 15)
							{
								pileSize = 15;
								System.out.println("there are " + pileSize + " stones remainiing");
								whoseTurn = 0;
							}
							else if (pileSize > 7)
							{
								pileSize = 7;
								System.out.println("there are " + pileSize + " stones remainiing");
								whoseTurn = 0;
							}
							else if (pileSize > 3)
								{
									pileSize = 3;
									System.out.println("there are " + pileSize + " stones remainiing");
									whoseTurn = 0;
								}
							else if (pileSize == 2)
							{
								pileSize = pileSize -1;
								System.out.println("there are " + pileSize + " stones remainiing");
								whoseTurn = 0;
							}
						}
					}
					//if true if will do the stupid computer move
					else if (smartOrStupid == 1)
					{
						//if there is only one stone left, it will end the game and declare a 
						//winner from the human perspective
							if (pileSize <= 1)
							{
								//declares who won from the human perspective
								System.out.println("You win");
								
								//ends game
								gameRunning = false;
								
								//ends program, to actually let the player chose to play another game
								//an if statement would have to be implemented controlled by user input
								programRunning = false;
							}
							
							//you must give a condition for an else if statement
							//I didn't want an else since that would run whether or
							// the if was true
							else if (pileSize > 1)
							{
								//stupidComputerMove;
									
								
									 if (pileSize > 1)
									{
										//math.rand was stored in a variable so it was easier to test
										int stonesGrabbed = (int)( (Math.random() * ((pileSize / 2)-1)) +1);
										//normally using duplicate local variables is discouraged, it should
										//probably be intialized outside the program and merely be updated here
										//however, that is merely a bmp and a way to possible make your code
										//more readable, it does NOT change how the program actually runs
										//kind of like as if you to write this code with less comments in it ;)
										//System.out.println("how much taken away domCup? " + stonesGrabbed);
						
										pileSize = pileSize - stonesGrabbed;
										System.out.println("there are " + pileSize + " stones remaining");
										whoseTurn = 0;
									}
									
									
									
							}
						
					}
				}	
			}	
		}		
		
		System.out.print("have a nice day!");
		
		// TODO Auto-generated method stub

	}

}

