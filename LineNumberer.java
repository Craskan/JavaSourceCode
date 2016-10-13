/**this class is designed to number documents
*/
//Caleb Kemp
//11.24.2014



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class LineNumberer
{
   public static void main (String[] args ) throws FileNotFoundException
   {
      //prompt for the input and output file names
   
      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String baseJava = "C:\\Users\\Craskan\\Documents\\Java\\";
      String inputFileName = baseJava + console.next();
      System.out.println("Output file: ");
      String outputFileName = baseJava + console.next();
   
      ///Construct the Scanner and PrintWriter objects for reading and writing
   
      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);
      int lineNumber = 1;

      //Read the input and write the output

      while(in.hasNextLine())
      {
        String line = in.nextLine();
        out.println("/* " + lineNumber + " */ " + line);
        lineNumber++;
      }
      in.close();
      out.close();
   
   }//end of main method

}//end of class LineNumberer