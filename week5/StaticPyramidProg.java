// StaticPyramidProg.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program creates a pyramid of a given character and height.      */ 

import java.util.Scanner;

public class StaticPyramidProg
{
   public final static int MARGIN = 10;

   public static char brickCharacter;
   public static int height;
   
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("\n\tEnter the number of lines for the pyramid: ");
      height = scan.nextInt();
      System.out.print("\tEnter the character from which the pyramid should be made: ");
      brickCharacter = scan.next().charAt(0);
      
      System.out.println(pyramidString());
   }
   
   //-----------------------------------------------------------------
   //  Returns a string containing a representation of the pyramid.
   //-----------------------------------------------------------------
   public static String pyramidString()
   {
      String pattern = "\n";
      for (int lineCount = 1; lineCount <= height; lineCount++)
      {
         pattern += pyramidLine(lineCount);
      }
      return pattern;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string containing a representation of 
   //  a given line of the pyramid.
   //-----------------------------------------------------------------
   private static String pyramidLine(int lineNumber)
   {
      String line = "";
      line += spacesForPyramidLine(lineNumber);
      line += symbolsForPyramidLine(lineNumber);
      line += "\n";
      return line;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string of spaces for the given line of the pyramid.
   //-----------------------------------------------------------------
   private static String spacesForPyramidLine(int lineNum)
   {
      String lineSpaces = "";
      for (int spacesCount = 1; spacesCount <= (MARGIN + height + 1 - lineNum); spacesCount++)
      {
         lineSpaces += " ";
      }
      return lineSpaces;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string of symbols for the given line of the pyramid.
   //-----------------------------------------------------------------
   private static String symbolsForPyramidLine(int lineNum)
   {
      String lineSymbols = "";
      for (int symbolsCount = 1; symbolsCount <= ((lineNum * 2) - 1); symbolsCount++)
      {
         lineSymbols += brickCharacter;
      }
      return lineSymbols;
   }
}
