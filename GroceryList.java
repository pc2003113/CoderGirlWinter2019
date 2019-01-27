import java.util.Scanner;

import static java.lang.System.out;

public class GroceryList
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        out.println("Item 1 ?");
        String item1 = keyboard.nextLine();
        out.println("Item 2 ?");
        String item2 = keyboard.nextLine();
        out.println("Item 3 ?");
        String item3 = keyboard.nextLine();

        out.println("Now, please enter the quantity of each item");
        out.println("How many "+item1+" ?");
        int item1Qty = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many "+item2+" ?");
        int item2Qty = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("How many "+item3+" ?");
        int item3Qty = keyboard.nextInt();
        keyboard.skip("\n");

        out.println("Now, please enter the price of each item");
        out.println("How much does one  "+item1+" cost?");
        float item1Cost = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does one  "+item2+" cost?");
        float item2Cost = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("How much does one  "+item3+" cost?");
        float Item3Cost = keyboard.nextFloat();
        keyboard.skip("\n");

        float totalCostOfMilk=item1Qty*item1Cost;
        float totalCostOfBread=item2Qty*item2Cost;
        float totalCostOfEggs=item3Qty*Item3Cost;

        out.println("Calculating your grocery bill.");
        float totalCost= totalCostOfMilk+totalCostOfBread+totalCostOfEggs;
        out.println("Your total cost is "+totalCost);



    }

}
