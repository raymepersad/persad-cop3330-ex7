/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 6 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.*/



package org.example;
import java.util.Scanner;

public class practiceexample7 {
    public static void main(String[] args) {
        double length,width,Area; //declare variables

        Scanner sc=new Scanner(System.in);

        System.out.print("What is the length of the room in feet? "); // prompts for length imput
        length=sc.nextDouble();

        System.out.print("What is the width of the room in feet? "); //prompts for width input
        width=sc.nextDouble();

        Area=length*width; //math calculation

        System.out.println("You entered dimension of "+length+" feet by "+width+" feet "); //print entered numbers

        System.out.println("The area is "+Area+" square feet ");

        // 1 square feet is equal to 0.09290 square meter so divide area by 10.764 since opposite

        Area=Area/10.764;

        System.out.println("The area is "+Area+" square meter ");

    }
}
