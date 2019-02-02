package com.launchcode;

import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[]args)

    {
        Scanner keyboard =new Scanner(System.in);
        int goalForVeggies=50;
        int goalForburgers=250;
        int goalForSubs=180;
        int goalForSoups=70;
//Veggie section
        System.out.println("The sales goal for Veggies is "+goalForVeggies);
        System.out.println("How many veggie sandwiches were sold today? ");
        int veggiesSold=keyboard.nextInt();
        boolean vegResult= veggiesSold>=goalForVeggies;
        if (vegResult==true)
        {
            System.out.println("Made Goal for veggies");
        }

        else
        {
            System.out.println("fell short for veggies");
        }
//Burger section
        System.out.println("The sales goal for burgers is "+goalForburgers);
        System.out.println("How many burgers were sold today? ");
        int burgersSold=keyboard.nextInt();
        boolean burgersResult= burgersSold>=goalForburgers;
        if (burgersResult==true)
        {
            System.out.println("Made Goal for burgers");
        }
        else
        {
            System.out.println("fell short for burgers");
        }
//subs section
        System.out.println("The sales goal for subs is "+goalForSubs);
        System.out.println("How many subs were sold today? ");
        int subsSold=keyboard.nextInt();
        boolean subsResult= subsSold>=goalForSubs;
        if (subsResult==true)
        {
            System.out.println("Made Goal for subs");
        }
        else
        {
            System.out.println("fell short for subs");
        }
//soups section

        System.out.println("The sales goal for soups is "+goalForSoups);
        System.out.println("How many soups were sold today? ");
        int soupsSold=keyboard.nextInt();
        boolean soupsResult= soupsSold>=goalForSoups;
        if (soupsResult==true)
        {
            System.out.println("Made Goal for subs");
        }
        else
        {
            System.out.println("fell short for subs");
        }

        if(vegResult && burgersResult && subsResult && soupsResult )
        {
            System.out.println("Made goal for everything!!");
        }


    }
}
