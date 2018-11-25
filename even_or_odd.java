import java.util.*;

public class even_or_odd
{
    public static void main (String args[])
    {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("What number do you want to test if it is even or odd? ");
        double NumberTaken = UserInput.nextDouble(); \\Takes the number from the user
        if (NumberTaken%2==0)
            System.out.println("The number you gave is even");
        else
            System.out.println("The number you gave is odd");
    }
}
