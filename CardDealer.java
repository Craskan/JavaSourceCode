import java.util.Scanner;
public class CardDealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int numOfProperties = 42;
		int maxNumOfPlayers = 8;
		String[] Players = new String[(numOfProperties+1)];
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("How many players are there?:");
		maxNumOfPlayers = in.nextInt(); 
		for (int i = 0; i< maxNumOfPlayers;i++)
		{
			Players[i] = NameOfPlayers(i,maxNumOfPlayers);
		}
		//so this dealhand is a randomized array of the property array
		int [] dealHand = fillArray(numOfProperties);
		
		String [] properties = CountryList(numOfProperties+1); 
		
		
		int PropertiesPerPlayer = 0;
		int numLeftoverProp = 0;
		if (numOfProperties%maxNumOfPlayers==0)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
		}
		else if (numOfProperties%maxNumOfPlayers==1)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =1;
		}
		else if (numOfProperties%maxNumOfPlayers==2)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =2;
		}
		else if (numOfProperties%maxNumOfPlayers==3)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =3;
		}
		else if (numOfProperties%maxNumOfPlayers==4)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =4;
		}
		else if (numOfProperties%maxNumOfPlayers==5)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =5;
		}
		else if (numOfProperties%maxNumOfPlayers==6)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =6;
		}
		else if (numOfProperties%maxNumOfPlayers==7)
		{
			PropertiesPerPlayer = (int)(numOfProperties/maxNumOfPlayers);
			numLeftoverProp =7;
		}
		
		//this initializes who owns what
		int Tracker = PropertiesPerPlayer;
		int lower = 0;
		for (int i = 0; i<maxNumOfPlayers;i++)
		{
			System.out.println(Players[i]+" has the following properties.");
			if (numLeftoverProp > i)
			{
				Tracker = Tracker +1;
			}
				
				//so this for loop right here is just interested in printing
				//the results
				for (int j = lower;j<Tracker;j++)
				{
					//remember deal hand was the property array randomized 
					System.out.println(properties[(dealHand[j])]);
				}
			//we want to be able to print off a list and know that properties
			//a to b belong to one player and so on, so what essentially happens
			//is this, we shuffled the property list and now were saying own
			//a to b on the property list, this player owns b to c, this player
			//owns c to d and so on.  The properties each player gets is random
			//because the property list is random.
			lower = Tracker;
			Tracker = Tracker +PropertiesPerPlayer;
		}
		
		
		
		// TODO Auto-generated method stub

	}
	public static String[] CountryList(int k)
	{
		String[] Countries =new String [(k+1)];
		Countries[0]="";
		Countries[1]="Eastern United States";
		Countries[2]="Western United States";
		Countries[3]="Alaska";
		Countries[4]="Quebec";
		Countries[5]="Ontario";
		Countries[6]="Northwest Territories";
		Countries[7]="Alberta";
		Countries[8]="Greenland";
		Countries[9]="Central America";
		Countries[10]="Venezuala";
		Countries[11]="Peru";
		Countries[12]="Argentina";
		Countries[13]="Brazil";
		Countries[14]="North Africa";
		Countries[15]="Congo";
		Countries[16]="South Africa";
		Countries[17]="Madigascar";
		Countries[18]="East Africa";
		Countries[19]="Egypt";
		Countries[20]="Southern Europe";
		Countries[21]="Western Europe";
		Countries[22]="Great Britain";
		Countries[23]="Iceland";
		Countries[24]="Northern Europe";
		Countries[25]="Central Europe";
		Countries[26]="Ukraine";
		Countries[27]="Middle East";				
		Countries[28]="India";	
		Countries[29]="Afganistan";	
		Countries[30]="Ural";	
		Countries[31]="Siberia";	
		Countries[32]="Irkutsk";	
		Countries[33]="Yakutsk";	
		Countries[34]="Mongolia";	
		Countries[35]="Kamchatka";	
		Countries[36]="Japan";	
		Countries[37]="China";	
		Countries[38]="Siam";	
		Countries[39]="Indonesia";
		Countries[40]="New Guinea";		
		Countries[41]="Western Australia";	
		Countries[42]="Eastern Australia";	
						
						
						
		return Countries;
	}
	public static String NameOfPlayers(int k, int j)
	{
		String[] player = new String [j+1];
		System.out.println("The name of the " +(k+1)+"th player is:");
		Scanner in = new Scanner(System.in);
		player[k] = in.nextLine();
		return player[k];
	}
	public static int[]fillArray(int Last)
	{
		int numLeftoverProp = Last;
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
		}
		return arrayKeep;
	}

}
