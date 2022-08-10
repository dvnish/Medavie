/*
 * Name: Danish Nadeem
 * Email: danishnadeem6@hotmail.com
 * Medavie Blue Cross Coding Assessment
 * August 9th, 2022
 * Project: Simple Ceiling Fan
 * Description: Unit has 2 pull cords:
 *  One cord: Increases the speed each time it is pulled. 
 *  With 3 speed settings. 
 *  Fan returns to 'off' position when cord is pulled at speed 3.
 *  Second cord: reverses the direction of the fan at current speed setting
 *  Assumptions:  Constant power (no wall switch)
 *                Manual user input as pull cords due to no hardware availability.
 */

import java.util.Scanner;


class CeilingFan {
    public static void main(String[] args) {
        int i=1;               //loop variable
        int speedLevel[] = new int[4];  //initialize speed levels array
        speedLevel[0]=0;
        speedLevel[1]=1;
        speedLevel[2]=2;
        speedLevel[3]=3;
        int speed=0;           //default position at off
        int fanDir=1;          //default 1: counterclockwise direction (summer setting)
                               //        2: clockwise direction (winter setting)
        
        //fan defaults and instructions displayed
        System.out.println("\nWelcome to The Basic Ceiling Fan");
        System.out.println("\n\nFan is currently off. \nCord 1: Increase Speed\nCord 2: Change fan direction\n\nEnter '1' or '2'\n\n");               

        // Infinite loop (Uni) is always powered)
        while (i > 0) {

            System.out.print("Please select a cord to pull: ");
            Scanner s = new Scanner(System.in);
            int cordChoice = s.nextInt();


            //if cord 1 is pulled by user, increment speed
            if (cordChoice == 1) {
                speed=speed+1;  
                if (speed==4){ //check if speed is greater than 3 to turn off
                    speed=0; //off position
                }
            //increment speed
            int newSpeed=speedLevel[speed];
            //Alerts user that the fan is off at speed 0
            if (newSpeed==0){
                System.out.println("Fan is now off\n");
                //otherwise prints the current speed
            } else {
                System.out.println("Fan speed is now: "+newSpeed);

                }
            }
            //if cord 2 is pulled by user, reverse direction
            if (cordChoice == 2){
                if (fanDir==1){
                    fanDir=2;
                    System.out.println("Fan is now spinning clockwise (winter setting)\n");

                }else if(fanDir==2){
                        fanDir=1;
                        System.out.println("Fan is now spinning counterlockwise (summer setting)\n");

                                    }
            }
                }       
        }
    }
    
