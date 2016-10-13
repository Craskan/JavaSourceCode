import java.util.Scanner;

public class BattleCardsManual
{
   static int [] allCards= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};

  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
  int [] battleDeck = Shuffler(allCards);
  

  boolean gameOn = true;
  int counter = 0;

  while(gameOn == true)
  {
  System.out.println("keep playing?: (\"q\" to end), (\"d\" to deleteCard");
  String input = in.next();  
    if(input.substring(0,1).equals("q"))
    {
      gameOn = false;
    }
    else if(input.substring(0,1).equals("d"))
    {
    System.out.println("which card would you like removed?: ");
    int removeCardIndex = in.nextInt();
    battleDeck = RemoveCard(battleDeck, removeCardIndex);
    }
    else
    {
    Translator(DealCard(battleDeck,counter));
    System.out.println("");
    counter++;
    }

  } 
    


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



  public static int DealCard(int [] deck, int counter)
  {
  return deck[counter];
  }

  public static int [] RemoveCard(int [] deck, int value)
  {
  int [] returnable = new int [deck.length-1];
   
   int index = 0;
   for(int j = 0; j < deck.length; j++)
   {
      if(deck[j] == value)
      {
      index = j;
      }
   }


    for(int i = 0; i < deck.length; i++)
    {
      if(i < index)
      {
      returnable[i] = deck[i];
      }
      else if (i == index)
      {
      Translator(deck[i]);
      }
      else if(i > index)
      {
      returnable[i-1] = deck[i];
      }  

    }
 return returnable;
 }


public static void Translator(int whichPiece)
    {
     if(whichPiece == 0)
     {
     System.out.print("Empty(e) ");
     } 
     else if(whichPiece > 0 && whichPiece < 4)
     {
     System.out.print("Bomb(b) ");//3
     }
     else if (whichPiece < 5)
     {
     System.out.print("Flag(f) ");//1
     }
     else if (whichPiece < 6)
     {
     System.out.print("Spy(s) ");//1
     }
     else if (whichPiece < 10)
     {
     System.out.print("Scout(2) ");//4
     }
     else if (whichPiece < 13)
     {
     System.out.print("Miner(3) ");//3
     }
     else if (whichPiece < 16)
     {
     System.out.print("Sargeant(4) ");//3
     }
     else if (whichPiece < 18)
     {
     System.out.print("Lieutenant(5) ");//2
     }
     else if (whichPiece < 20)
     {
     System.out.print("Captain(6) ");//2
     }
     else if (whichPiece < 21)
     {
     System.out.print("Major(7) ");//1
     }
     else if (whichPiece < 22)
     {
     System.out.print("Colonel(8) ");//1
     }
     else if (whichPiece < 23)
     {
     System.out.print("General(9) ");//1
     }
     else if (whichPiece < 24)
     {
     System.out.print("Marshall(10) ");//1
     }
    }//end of translator method

}//end of BattleCardsManual class