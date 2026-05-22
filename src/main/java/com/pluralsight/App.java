package com.pluralsight;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        homeMenu();
    }
    public static void homeMenu(){
        while (true){
            System.out.println("================");
            System.out.println("HELIX BIOWORKS");
            System.out.println("================");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("================");
            int homeInput = input.nextInt();



                //calls methods with code for each function
                switch (homeInput) {
                    case 1:
                        // open sub menu
                        break;
                    case 0:
                        System.out.println("The program exits");
                        return;
                }

            }

        }
        //menu methods


}


