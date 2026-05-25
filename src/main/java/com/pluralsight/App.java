package com.pluralsight;

import com.pluralsight.creature.*;
import com.pluralsight.order.Order;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static Order order = new Order();
    public static Organism organismChoice;
    public static Genome genomeChoice;
    public static Scale scaleChoice;
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
                sizeMenu();
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
    public static void sizeMenu(){
        System.out.println("================");
        System.out.println("1) Class I");
        System.out.println("2) Class II");
        System.out.println("3) Class III");
        System.out.println("4) Class IV");
        System.out.println("0) Cancel Order");
        System.out.println("================");
        int sizeInput = input.nextInt();

        switch (sizeInput){
            case 1:
                scaleChoice = Scale.CLASS_I;
                break;
            case 2:
                scaleChoice = Scale.CLASS_II;
                break;
            case 3:
                scaleChoice = Scale.CLASS_III;
                break;
            case 4:
                scaleChoice = Scale.CLASS_IV;
                break;
            case 0:
                break;

        }if (sizeInput >= 1){
            organismChoice = new Organism(genomeChoice, scaleChoice, false);
        }

    }
    public static void offensiveMenu(){
        System.out.println("================");
        System.out.println("1) Venom Glands");
        System.out.println("2) Razor bone spurs");
        System.out.println("3) Bio-electric organs");
        System.out.println("4) Acid secretion sacs");
        System.out.println("5) Crushing Appendages");
        System.out.println("0) Back");
        System.out.println("================");
        int offensiveInput = input.nextInt();


        switch (offensiveInput){
            case 1:
                organismChoice.addWeapons(new OffensiveAdaptation("Venom Glands", new Credits(500),false));
                break;
            case 2:
                organismChoice.addWeapons(new OffensiveAdaptation("Razor bone spurs", new Credits(500),false));
                break;
            case 3:
                organismChoice.addWeapons(new OffensiveAdaptation("Bio-electric organs", new Credits(500),false));
                break;
            case 4:
                organismChoice.addWeapons(new OffensiveAdaptation("Acid secretion sacs", new Credits(500),false));
                break;
            case 5:
                organismChoice.addWeapons(new OffensiveAdaptation("Crushing Appendages", new Credits(500),false));
                break;
            case 0:

                break;

        }
    }
}



