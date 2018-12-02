import java.util.*;

public class FibonacciSequence
{
    public static void main (String args[])
    {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Fibonacci Sequence");
        LineBreak();
        System.out.print("Enter the nth term of the Fibonacci Sequence you would like to see? ");
        int nthTerm = UserInput.nextInt();
        int firstTerm = 1;
        int secondTerm = 1;
        int finalNumber = 0;
        int x = 2;
        if (nthTerm == 1||nthTerm==2)
        {
            System.out.println("The "+nthTerm + "th term is 1.");
        }
        else if (nthTerm>0)
        {
            while(x<nthTerm)
            {
            finalNumber = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = finalNumber;
            x++;
            }
        System.out.println("The "+nthTerm + "th term is "+finalNumber);
        }
        else
        {
        System.out.println("Error has occured, please re-enter: ");
        nthTerm = UserInput.nextInt();
        }
    }
    public static void LineBreak()
    {
        for(int x = 0; x<50;x++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }
}
