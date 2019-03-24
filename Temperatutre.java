package com.launchcode.section6;

public class Temperatutre {
    public static void main(String args []){
        int tempGrid [][]={{68,70,76,70,68,71,71},
                           {76,76,87,84,82,75,83},
                           {73,72,81,78,76,73,77},
                           {64,65,69,68,70,74,72}};
        /* to find the matrix/grid
        //System.out.print(tempGrid [i][j]+",");*/

        // to calculate the avergage for each time of the week
        System.out.println(" ");
        System.out.println("------------------avergage for each time of the week------------------------------------ ");

        for(int i=0;i<4;i++){
            int sumAvgTempForTime=0;
            for(int j=0;j<7;j++){
                sumAvgTempForTime=sumAvgTempForTime+tempGrid[i][j];
         }
            System.out.println("Average temperature for each time = "+(sumAvgTempForTime/7));
        }

        // to calculate the avergage for each day of the week
        System.out.println(" ");
        System.out.println("------------------avergage for each day of the week------------------------------------ ");
        for(int i=0;i<7;i++){
            int sumAvgTempForEachDay=0;
            for(int j=0;j<4;j++){
                sumAvgTempForEachDay=sumAvgTempForEachDay+tempGrid[j][i];
            }
            System.out.println("Average temperature for each Day = "+(sumAvgTempForEachDay/4));
        }

        // to calculate the overall avergage for the week
        System.out.println(" ");
        System.out.println("------------------Overall Average for the week ------------------------------------ ");

        int overallAvgTempForTheWeek=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                overallAvgTempForTheWeek=overallAvgTempForTheWeek+tempGrid[i][j];
            }

        }
        System.out.println("Overall Average temperature for the week = "+(overallAvgTempForTheWeek/28));



    }

}
