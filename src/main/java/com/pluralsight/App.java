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
                        addCreature();
                        break;
                    case 0:
                        System.out.println("The program exits");
                        return;
                }

            }

        }
        //menu methods
        public static void addCreature(){
            System.out.println("================");
            System.out.println("1) Commission Creature");
            System.out.println("2) Add Transport Package");
            System.out.println("3) Add Maintenance Kit");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("================");
            int newOrderInput = input.nextInt();

            switch (newOrderInput){
                case 1:
                    //Commission Creature
                    break;
                case 2:
                    //Add Transport Package
                    break;
                case 3:
                    //Add Maintenance Kit
                    break;
                case 4:
                    //Checkout
                    break;
                case 0:
                    //Cancel Order
                    break;
            }
        }

}


