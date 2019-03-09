package com.launchcode.section5;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String args[]){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Welcome to Multiplication Tables");
        System.out.println("How large would you like to see them.( Make sure the number is lessthan 20)");
        int size =keyboard.nextInt();
        int j=0;
        int i=0;
        for ( i=0;i<=size;i++){
            for (j=0;j<=size;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }

        }

    }
}
