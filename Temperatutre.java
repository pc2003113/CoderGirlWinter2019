package com.launchcode.section6;

public class Temperatutre {
    public static void main(String args []){
 int tempGrid [][]={{68,70,76,70,68,71,71},
                           {76,76,87,84,82,75,83},
                           {73,72,81,78,76,73,77},
                           {64,65,69,68,70,74,72}};
        String [] days={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        String [] time={"7:00 AM","3:00 PM","7:00 PM","3:00 AM"};

        System.out.println("Temperature Calculator");
        System.out.println(" ");
        System.out.println("The data provided are :");
        for(int i=0;i<4;i++){
            System.out.print(time[i]+": ");
            for(int j=0;j<7;j++){

                System.out.print(tempGrid[i][j]+", ");
            }
            System.out.println(" ");

        }


        // to calculate the avergage for each day of the week
        System.out.println(" ");
        System.out.println("Based on that data, the following are the average temperature of the week.");
        System.out.println(" ");
        for(int i=0;i<7;i++){
            int sumAvgTempForEachDay=0;
            for(int j=0;j<4;j++){
                sumAvgTempForEachDay=sumAvgTempForEachDay+tempGrid[j][i];
            }
            System.out.println(days[i]+": "+(sumAvgTempForEachDay/4));
        }



        // to calculate the avergage for each time of the week
        System.out.println(" ");
        //System.out.println("------------------avergage for each time of the week------------------------------------ ");

        for(int i=0;i<4;i++){
            int sumAvgTempForTime=0;
            for(int j=0;j<7;j++){
                sumAvgTempForTime=sumAvgTempForTime+tempGrid[i][j];
         }
            System.out.println(time[i]+": "+(sumAvgTempForTime/7));
        }


        // to calculate the overall avergage for the week
        System.out.println(" ");
        System.out.println("The final average temperature for the week was :");

        int overallAvgTempForTheWeek=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<7;j++){
                overallAvgTempForTheWeek=overallAvgTempForTheWeek+tempGrid[i][j];
            }

        }
        System.out.println(" ");
        System.out.println("Overall: "+(overallAvgTempForTheWeek/28));



    }

}
