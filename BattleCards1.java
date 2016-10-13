

public class BattleCards1
{
Static String [] deckOne = {"bomb","bomb","bomb","flag","spy","scout","scout","scout","scout","miner","miner","miner","sargeant","sargeant","sargeant","Lieutenant","Lieutenant","captain","captain","major","colonel","general","marshall"};


//static String [] playerNames = {};
//static String [] deckTotals = {};
//static String [] deckMains = {"all playable cards,including liveCards"};
//static String [] deckPicks = {"pickable cards", "card1"};
//static String [] frontLines = {"5 cards"};
//static String [] hands = {};
//static String [] liveCards = {"a"};
//static String [] deadCards = {};
//the first box is how many arrays need to be held (number of aspects)
//the second box is how many players there are(one for each player)
//and the last box holds all the actual data :)
//static String [][][] playerData = {{{}} };

public static void main(String args[])
{
String[][][] a = new String[1][1][5];
a[0][0][0] = "Greg"; 
a[0][0][1] = "Truman";
a[0][0][2] = "Caleb";
a[0][0][3] = "Krissy";
a[0][0][4] = "Hinton";

Print3ArrayString(a);

//System.out.println("meep");
//frontLine = Pop(frontLine);
//PrintArrayString(frontLine);
//frontLine = Push(frontLine,"meekly");
//PrintArrayString(frontLine);
//PrintArrayString(playerData);
//DrawCard(deckPicks,liveCards);
PrintArrayString(deckPicks);
System.out.println();
System.out.println("above is deck pick, below is livecards");
PrintArrayString(liveCards);
}

public static String[] Push(String[] arrayS, String value)
{
//this will append a value to the end of the String [] array 
//the AddItem method works like a push method if given an invalid input
//for an array index, -1 will always be out of bounds
int outOfBounds = -1;
String [] returnable = AddItem(arrayS,value,outOfBounds);
return returnable;

}
public static String[] Pop(String[] arrayS)
{
//this will remove the last value from a String [] array
int len = arrayS.length;
String [] returnable = RemoveItem(arrayS,len-1);
return returnable;
}
public static String[] AddItem(String [] arrayS,String item,int index)
{
//this inserts a value at the given index, if the index is out of bounds
//(such as -1), it will automatically append it at the end
int len = arrayS.length;
String [] returnable = new String[(len + 1)];
 if(index >= 0 && index <= len) 
 {
 //legal index insert value 
   for(int j = 0; j <= len;j++)
   {
     if(index > j)
     {
      returnable[j] = arrayS[j];
     }
     else if(index == j)
     {
     returnable[j] = item;
     }
     else
     {
     returnable[j] = arrayS[j-1];
     }

   } 

 }
 else
 {
   for(int i = 0; i < len; i++)
   {
   returnable[i] = arrayS[i];
   }
  returnable[len] = item;
 }
return returnable;
}
public static String[] RemoveItem(String [] arrayS, int index)
{
// this will return the original array if the index is out of bounds
int len = arrayS.length;
String [] returnable;
if(index >= 0 && index < len)
{
//remove item
returnable = new String[len-1];
for(int i = 0; i < len; i++)
{
 if( i < index)
 {
 returnable[i] = arrayS[i];
 } 
 else if(i > index)
 {
  returnable[i-1] = arrayS[i];
 }

}


}
else
{
//error message
System.out.println("index out of bounds, original array returned");
returnable = arrayS;
}
return returnable;


}
public static String[] RemoveSearch(String [] arrayS, String item)
{
//this method returns the original array if item not found

String [] returnable;
int index = SearchItem(arrayS,item);
 if(index >= 0)
 {
 //remove item
 returnable = RemoveItem(arrayS,index);
 }
 else
 {
 //error message
 returnable = arrayS;
 System.out.println("item "+item+" could not be found in array "+arrayS);
 }

return returnable;
}
public static int SearchItem(String [] arrayS, String item)
{
//if index = -1, item not found, else the value is the index
int len = arrayS.length;
boolean itemFound = false;
int index = -1;
 int i = 0;
 while(i < len && itemFound == false)
 {
  if(arrayS[i] == item)
  {
   itemFound = true;
   index = i;
  }
   
 }
 return index;

}

public static void PrintArrayString(String [] arrayS)
{
 //int len = arrayS.length;
  for(int i = 0,len = arrayS.length; i < len; i++)
  {
  System.out.print(arrayS[i]+" ");
  }
}
public static void Print2ArrayString(String [][] arrayS)
{
int len = arrayS.length;
 for(int i = 0; i < len; i++)
 {
   PrintArrayString(arrayS[i]);
  
  //for(int j = 0; j < arrayS[i].length; j++)
  //{
  //System.out.println(arrayS[i][j] + " ");
  //}

 }
}
public static void Print3ArrayString(String [][][] arrayS)
{
int len = arrayS.length;
for(int i = 0; i < len; i++)
{
Print2ArrayString(arrayS[i]);
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


//public static String [] initiatePlayer(String [] deck)
//{
//what is playerName
//deal player eight cards from deck


//}
/*public static String [] CopyStringArray(String [] arrayS)
{
//you might wonder why this is here at all, well if you don't manually
//copy the array and just use the x = y method for an array, you don't
//actually copy it, you only copy it's reference, often that is not very
//useful.

int len = arrayS.length;
String [] returnable = new String[len];
for(int i = 0; i < len; i++)
{
returnable[i] = arrayS[i];
}
return returnable;
}
public static String [][] CopyString2Array(String [][] arrayS)
{
int len = arrayS.length;
String [] returnable = new String[len];
for(int i = 0; i < len; i++)
{
returnable[i] = CopyStringArray(arrayS[i]);
}
return returnable;
}*/
/*public static String [] AccessObjectArray(String arrayS [][][],int aspect, int player,int index)
{
String returnable[] = {};
int len = arrayS.length;
  for(int i = 0; i < len; i++)
  {
  accessObject(array[i])  
  addItem(returnable,array[i])

  }

}*/

}