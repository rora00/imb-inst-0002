// ProblemSolvingDecomposed.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program outputs a quote from Lewis and Loftus about problem solving.      */ 

public class ProblemSolvingDecomposed
{
   //-----------------------------------------------------------------
   //  Prints a quote from Lewis and Loftus about problem solving.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      printIntroduction();
      printPoints();
      printConclusion();
      printAcknowledgement();
   }
   
   //-----------------------------------------------------------------
   //  Prints the acknowledgement.
   //-----------------------------------------------------------------
   private static void printAcknowledgement()
   {
      System.out.println("\t\t\t\t\t(Lewis and Loftus, 2003)\n");
   }

   //-----------------------------------------------------------------
   //  Prints the concluding part of the quote.
   //-----------------------------------------------------------------
   private static void printConclusion()
   {
      System.out.println("\n\tAlthough this approach applies to any kind of problem,");
      System.out.println("\tit works particularly well when developing software.\"\n");
   }
   
   //-----------------------------------------------------------------
   //  Prints the introductory part of the quote.
   //-----------------------------------------------------------------
   private static void printIntroduction()
   {
      System.out.println("\n\t\"The purpose of writing a program is to solve a problem.");
      System.out.println("\tProblem solving, in general, consists of multiple steps:\n");
   }
   
   //-----------------------------------------------------------------
   //  Prints the points in the quote.
   //-----------------------------------------------------------------
   private static void printPoints()
   {
      printPoint(1);
      printPoint(2);
      printPoint(3);
      printPoint(4);
      printPoint(5);
      printPoint(6);
   }
   
   private static void printPoint(int point)
   {
        switch(point)
        {
            case 1: printPoint1();
            break;
            case 2: printPoint2();
            break;
            case 3: printPoint3();
            break;
            case 4: printPoint4();
            break;
            case 5: printPoint5();
            break;
            case 6: printPoint6();
            break;
            default: System.exit(0);

        }
   }
   //-----------------------------------------------------------------
   //  Prints point 1 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint1()
   {
      System.out.println("\t\t1.\tUnderstanding the problem.");
   }
   
   //-----------------------------------------------------------------
   //  Prints point 2 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint2()
   {
      System.out.println("\t\t2.\tBreaking the problem into manageable pieces.");
   }
   
   //-----------------------------------------------------------------
   //  Prints point 3 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint3()
   {
      System.out.println("\t\t3.\tDesigning a solution.");
   }
   
   //-----------------------------------------------------------------
   //  Prints point 4 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint4()
   {
      System.out.println("\t\t4.\tConsidering alternatives to the solution");
      System.out.println("\t\t\tand refining the solution.");
   }
   
   //-----------------------------------------------------------------
   //  Prints point 5 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint5()
   {
      System.out.println("\t\t5.\tImplementing the solution.");
   }
   
   //-----------------------------------------------------------------
   //  Prints point 6 in the quote.
   //-----------------------------------------------------------------
   private static void printPoint6()
   {
      System.out.println("\t\t6.\tTesting the solution and fixing any problems");
      System.out.println("\t\t\tthat exist.");
   }
   
}