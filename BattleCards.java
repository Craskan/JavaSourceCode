import java.util.Scanner;

public class BattleCards
{
   static int [] allCards= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
   static int [] totalHand = {0,0,0,0,0,0,0,0};
   static int [] reserve = {0,0,0};
   static int [] frontLine = {0,0,0,0,0};

   public static void main(String args[])
   {
   int shuffledDeck[] = Shuffler(allCards);
   //deal deck
   for (int i = 0; i < totalHand.length; i++)
   {
   totalHand[i] = shuffledDeck[shuffledDeck.length-1];
   shuffledDeck = DeleteCard(shuffledDeck, shuffledDeck.length-1);
   }

   Scanner in = new Scanner(System.in);
   System.out.println("Welcome to BattleCards!, please pick five cards for your frontline");
   System.out.println("type in each cards number first number, with no spaces i.e. '12345': ");
   

   for(int j = 0; j < totalHand.length; j++)
   {
   System.out.print("("+ (j+1) +") ");
   Translator(totalHand[j]);
   System.out.print(" ");
   }
   
   int [] remainingCards = new int[totalHand.length];   
   int [] cardsPicked = new int [frontLine.length];

   String front = in.nextLine();

   for(int k = 0; k < frontLine.length; k++)
   {
   int currentPick = Integer.parseInt(front.substring(k,(k+1)));
   frontLine[k] = totalHand[currentPick-1];
   System.out.println("frontLine[k] " + frontLine[k] +" ");
   cardsPicked[k] = currentPick-1;
   
   }

   for(int m = 0; m < frontLine.length; m++)
   {
   remainingCards[cardsPicked[m]];
   }

   for(int n = 0; n < reserve.length; n++)
   {
   PrintCards(remainingCards);
   reserve[n] = totalHand[remainingCards[n]];
   }


   

   //PrintCards(totalHand);
   //System.out.println("");
   //PrintCards(shuffledDeck);


   PrintHand(frontLine,reserve);
   //PrintCards(shuffledDeck);
   //shuffledDeck = DeleteCard(shuffledDeck,4);
   //System.out.println("");
   //PrintCards(shuffledDeck);
   
   

  
   }
   public static int [] Shuffler (int [] shuffleIt)
   {
     int [] returnable = new int[shuffleIt.length]; 
     int [] temporary = new int[shuffleIt.length];    
     for(int i = 0; i < shuffleIt.length; i++)
     {
       temporary[i] = shuffleIt[i];
        
     }

      int selected = 0;
      int temp = 0; 
      int whichCard = 0;    

      for(int i = shuffleIt.length-1; i >= 0; i--)
      {
        selected = (int)(Math.random() * i); 
        
        temp = temporary[i];
        returnable[whichCard] = temporary[selected];
        temporary[i] = temporary[selected];
        temporary[selected] = temp;
        whichCard++;
      }
     


   return returnable;

   }//end of Shuffler method

     public static int [] DeleteCard(int [] deck, int whichCard)
     {
       int [] returnable = new int[deck.length-1];
       //int temp = deck[whichCard];
       //deck[whichCard] = deck[deck.length-1];
       //deck[deck.length-1] = temp;

       for(int i = 0; i < returnable.length; i++)
       {
         if(i < whichCard)
         {
         returnable[i] = deck[i];
         }
         else if(i >= whichCard)
         {
         returnable[i] = deck[i+1];
         }

       }
     return returnable;

        

    }//end of deletecard method
   
    public static void PrintCards(int[] deck)
    {
      for(int i = 0; i < deck.length; i++)
      {
      System.out.print(deck[i] + " ");
      }
    }//end of PrintCards method

    public static void PrintHand(int [] frontLine, int [] reserve)
    {
      System.out.println("");
      System.out.println("Front Line cards:");
      for(int i = 0; i < frontLine.length; i++)
      {
       Translator(frontLine[i]);
      }
      System.out.println("");
      System.out.println("Reserve Cards:");
      for(int j = 0; j < reserve.length; j++)
      {
       Translator(reserve[j]);
      }
    
    }
   



    public static void Translator(int whichPiece)
    {
     if(whichPiece == 0)
     {
     System.out.print("Empty(e) ");
     } 
     else if(whichPiece > 0 && whichPiece < 4)
     {
     System.out.print("Bomb(b) ");
     }
     else if (whichPiece < 5)
     {
     System.out.print("Flag(f) ");
     }
     else if (whichPiece < 6)
     {
     System.out.print("Spy(s) ");
     }
     else if (whichPiece < 10)
     {
     System.out.print("Scout(2) ");
     }
     else if (whichPiece < 13)
     {
     System.out.print("Miner(3) ");
     }
     else if (whichPiece < 16)
     {
     System.out.print("Sargeant(4) ");
     }
     else if (whichPiece < 18)
     {
     System.out.print("Lieutenant(5) ");
     }
     else if (whichPiece < 20)
     {
     System.out.print("Captain(6) ");
     }
     else if (whichPiece < 21)
     {
     System.out.print("Major(7) ");
     }
     else if (whichPiece < 22)
     {
     System.out.print("Colonel(8) ");
     }
     else if (whichPiece < 23)
     {
     System.out.print("General(9) ");
     }
     else if (whichPiece < 24)
     {
     System.out.print("Marshall(10) ");
     }
    }//end of translator method

    


}