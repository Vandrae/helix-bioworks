package com.pluralsight;

import com.pluralsight.creature.*;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Order order = new Order();
    public static Organism currentOrganism;
    public static Genome genomeChoice;
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
                commissionCreature();
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
    public static void commissionCreature(){
        System.out.println("================");
        System.out.println("1) Genome");
        System.out.println("2) Size");
        System.out.println("3) Offensive Adaptations");
        System.out.println("4) Defensive Adaptations");
        System.out.println("5) Standard Attributes");
        System.out.println("6) Conditioning");
        System.out.println("7) Growth Vat (Accelerated Growth)");
        System.out.println("0) Cancel Order");
        System.out.println("================");
        int commissionInput = input.nextInt();

        switch (commissionInput){
            case 1:
                //Genome
                genomeMenu();
                break;
            case 2:
                //Scale
                break;
            case 3:
                //OO
                break;
            case 4:
                //DO
                break;
            case 5:
                //SA
                break;
            case 6:
                //Conditioning
                break;
            case 7:
                //GV
                break;
            case 0:
                break;
        }


    }
    public static void genomeMenu(){
        System.out.println("================");
        System.out.println("1) Primate");
        System.out.println("2) Insectoid");
        System.out.println("3) Reptilian");
        System.out.println("4) Avian");
        System.out.println("5) Aquatic");
        System.out.println("6) Apex");
        System.out.println("0) Cancel Order");
        System.out.println("================");
        int genomeInput = input.nextInt();

        switch (genomeInput){
            case 1:
                genomeChoice = Genome.PRIMATE;
                break;
            case 2:
                genomeChoice = Genome.INSECTOID;
                break;
            case 3:
                genomeChoice = Genome.REPTILIAN;
                break;
            case 4:
                genomeChoice = Genome.AVIAN;
                break;
            case 5:
                genomeChoice = Genome.AQUATIC;
                break;
            case 6:
                genomeChoice = Genome.APEX;
                break;
            case 0:
                break;
        }
    }
}



