import java.util.*;

public class ChangeReturn
{
public static void main (String args[])
{
Scanner UserInput = new Scanner(System.in);
System.out.print("What is the total cost of the product? ");
double costOfProduct = UserInput.nextDouble();
System.out.print("\nWhat is the amount of money that you spent?");
double paymentofProduct = UserInput.nextDouble();
double changeToReturn = paymentofProduct - costOfProduct; //Assumes that you paid for more than the cost
//changeToReturn%25 
//changeToReturn%5
//changeToReturn%10
//return(changeToReturn)
System.out.println("The total is " + changeToReturn);
}

}
