*/
A+B
Given two integer,   A and B.
Their sum needs to be calculated.
*/


import java.util.*;

public class ABAddition \\Can only work with whole numbers
{
  public static void main (String args[]) 
  {
  Scanner UserInput = new Scanner(System.in);
  System.out.println("Enter the first number");
  int FirstNumber = UserInput.nextInt(); \\Takes the first number that the user inputs
  System.out.println("Enter the second number");
  int SecondNumber = UserInput.nextInt(); \\ Takes the second number that the user inputs
  System.out.println("Sum" + (FirstNumber + SecondNumber)); \\Adds the two numbers the user inputs
  System.out.println("For decimals");
    
  System.out.println("Enter the first number");
  double First_Number = UserInput.nextDouble();
  System.out.println("Enter the second number");
  double Second_Number = UserInput.nextDouble();
  System.out.println("Sum " + (First_Number+Second_Number));
  }
}
