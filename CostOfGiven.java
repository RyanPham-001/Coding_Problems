/*
Given a length and width and cost of each tile, determine the total cost of putting tiles on the floor with variable length and width.
*/

import java.util.*;
import java.text.DecimalFormat;
public class CostOfGiven
{
    public static void main (String args[])
    {
        Scanner UserInput = new Scanner(System.in);
        DecimalFormat ChangeToMoney = new DecimalFormat("#.00");

        System.out.print("What is the total length of the floor? ");
        double lengthOfFloor = UserInput.nextDouble(); //Takes the length of the floor from the user

        System.out.print("\nWhat is the total widith of the floor? ");
        double widthOfFloor = UserInput.nextDouble(); //Takes the width of the floor from the user

        System.out.print("\nWhat is the length of the tile? ");
        double lengthOfTile = UserInput.nextDouble(); //Takes the length of the tile from the user

        System.out.println("\nWhat is the width of the tile? ");
        double widthOfTile = UserInput.nextDouble(); //Takes the width of the tiles from the user

        System.out.println("\nWhat is the cost of each tile? ");
        double CostOfTile = UserInput.nextDouble(); //Takes the cost of each tile from the user

        double AreaOfFloor = Multiplication(lengthOfFloor,widthOfFloor); //Finds the total area of the floor using mutliplication
        double AreaOfTile = Multiplication(lengthOfTile,widthOfTile); //Finds the total area of the tile using multiplication
        double NumberOfTiles = Division(AreaOfFloor,AreaOfTile); //Finds the number of tiles that can fit in the area

        double TotalCost = Multiplication(NumberOfTiles,CostOfTile); //Finds the total cost of the tiles in the floor
        System.out.println("The total cost to fill this " + widthOfFloor +" by "+ lengthOfFloor +" floor with tiles is $"+ ChangeToMoney.format(TotalCost));;
    }

    public static double Multiplication(double FirstValue, double SecondValue)
    {
        return(FirstValue*SecondValue); //Returns the prodcuts of the two values given
    }

    public static double Division (double FirstValue, double SecondValue)
    {
        //FirstValue is the dividend, SecondValue is the divisor
        return(FirstValue/SecondValue); //Returns the quotient of the two given values
    }


}
