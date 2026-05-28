package com.pluralsight;

import com.pluralsight.creature.*;
import com.pluralsight.order.*;

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
        while (true) {
            System.out.println("================");
            System.out.println("1) Commission Creature");
            System.out.println("2) Add Transport Package");
            System.out.println("3) Add Maintenance Kit");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("================");
            int newOrderInput = input.nextInt();

            switch (newOrderInput) {
                case 1:
                    //Commission Creature
                    commissionCreature();
                    break;
                case 2:
                    //Add Transport Package
                    transportPackage();
                    break;
                case 3:
                    //Add Maintenance Kit
                    maintenanceKit();
                    break;
                case 4:
                    //Checkout
                    Checkout();
                    return;
                case 0:
                    //Cancel Order using App.cancelOrder(); to makesure we call the correct cancelOrder() method
                    App.cancelOrder();
                    return;
            }
        }
    }

    public static void commissionCreature(){
        while (true) {
            System.out.println("================");
            System.out.println("1) Genome");
            System.out.println("2) Size");
            System.out.println("3) Offensive Adaptations");
            System.out.println("4) Defensive Adaptations");
            System.out.println("5) Standard Attributes");
            System.out.println("6) Conditioning");
            System.out.println("7) Growth Vat (Accelerated Growth)");
            System.out.println("8) Add to Cart");
            System.out.println("0) Back");
            System.out.println("================");
            int commissionInput = input.nextInt();

            switch (commissionInput) {
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
                    offensiveMenu();
                    break;
                case 4:
                    //DO
                    defensiveMenu();
                    break;
                case 5:
                    //SA
                    standardMenu();
                    break;
                case 6:
                    //Conditioning
                    behaviorMenu();
                    break;
                case 7:
                    //GV
                    acceleratedGrowth();
                    break;
                case 8:
                    order.addOrganism(organismChoice);
                    System.out.println(order.getOrderSummary());
                    return;
                case 0:
                    return;
            }
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
        System.out.println("0) Back");
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
        while (true) {
            System.out.println("================");
            System.out.println("1) Venom Glands");
            System.out.println("2) Razor bone spurs");
            System.out.println("3) Bio-electric organs");
            System.out.println("4) Acid secretion sacs");
            System.out.println("5) Crushing Appendages");
            System.out.println("6) Active Camouflage");
            System.out.println("0) Back");
            System.out.println("================");
            int offensiveInput = input.nextInt();


            switch (offensiveInput) {
                case 1:
                    organismChoice.addWeapons(new OffensiveAdaptation("Venom Glands", new Credits(500), false));
                    break;
                case 2:
                    organismChoice.addWeapons(new OffensiveAdaptation("Razor bone spurs", new Credits(500), false));
                    break;
                case 3:
                    organismChoice.addWeapons(new OffensiveAdaptation("Bio-electric organs", new Credits(500), false));
                    break;
                case 4:
                    organismChoice.addWeapons(new OffensiveAdaptation("Acid secretion sacs", new Credits(500), false));
                    break;
                case 5:
                    organismChoice.addWeapons(new OffensiveAdaptation("Crushing Appendages", new Credits(500), false));
                    break;
                case 6:
                    organismChoice.addWeapons(new OffensiveAdaptation("Active Camouflage", new Credits(500), false));
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void defensiveMenu(){
        while (true) {
            System.out.println("================");
            System.out.println("1) Subdermal Armor");
            System.out.println("2) Rapid Clotting Tissue");
            System.out.println("3) Toxin Immunity");
            System.out.println("4) Chromatophore Camo");
            System.out.println("5) Severe Heat Hide");
            System.out.println("6) Severe Cold Hide");
            System.out.println("0) Back");
            System.out.println("================");
            int defensiveInput = input.nextInt();


            switch (defensiveInput) {
                case 1:
                    organismChoice.addDefenses(new DefensiveAdaptation("Subdermal Armor", new Credits(500), false));
                    break;
                case 2:
                    organismChoice.addDefenses(new DefensiveAdaptation("Rapid Clotting Tissue", new Credits(500), false));
                    break;
                case 3:
                    organismChoice.addDefenses(new DefensiveAdaptation("Toxin Immunity", new Credits(500), false));
                    break;
                case 4:
                    organismChoice.addDefenses(new DefensiveAdaptation("Chromatophore Camo", new Credits(500), false));
                    break;
                case 5:
                    organismChoice.addDefenses(new DefensiveAdaptation("Severe Heat Hide", new Credits(500), false));
                    break;
                case 6:
                    organismChoice.addDefenses(new DefensiveAdaptation("Severe Cold Hide", new Credits(500), false));
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void standardMenu() {
        while (true) {
            System.out.println("Choose any number of Options");
            System.out.println("================");
            System.out.println("1) Enhanced Smell");
            System.out.println("2) Infrared Vision");
            System.out.println("3) Increased Stamina");
            System.out.println("4) Aggression tuning");
            System.out.println("5) Pack Tactics");
            System.out.println("6) Vocal Suppression");
            System.out.println("7) Neural Compliance");
            System.out.println("0) Back");
            System.out.println("================");
            int standardInput = input.nextInt();

            switch (standardInput) {
                case 1:
                    organismChoice.addMods(new StandardMod("Enhanced Smell"));
                    break;
                case 2:
                    organismChoice.addMods(new StandardMod("Infrared Vision"));
                    break;
                case 3:
                    organismChoice.addMods(new StandardMod("Increased Stamina"));
                    break;
                case 4:
                    organismChoice.addMods(new StandardMod("Aggression tuning"));
                    break;
                case 5:
                    organismChoice.addMods(new StandardMod("Pack Tactics"));
                    break;
                case 6:
                    organismChoice.addMods(new StandardMod("Vocal Suppression"));
                    break;
                case 7:
                    organismChoice.addMods(new StandardMod("Neural Compliance"));
                    break;
                case 0:
                    return;

            }
        }
    }

    public static void behaviorMenu() {
        while (true) {
            System.out.println("Choose any number of Options");
            System.out.println("================");
            System.out.println("1) Imprinting Bonding");
            System.out.println("2) Aggression Targeting");
            System.out.println("3) Territorial");
            System.out.println("4) Feral");
            System.out.println("5) Memory Erasure");
            System.out.println("0) Back");
            System.out.println("================");
            int behaviorInput = input.nextInt();

            switch (behaviorInput) {
                case 1:
                    organismChoice.addBehaviors(new Behaviors("Imprinting Bonding"));
                    break;
                case 2:
                    organismChoice.addBehaviors(new Behaviors("Aggression Targeting"));
                    break;
                case 3:
                    organismChoice.addBehaviors(new Behaviors("Territorial"));
                    break;
                case 4:
                    organismChoice.addBehaviors(new Behaviors("Feral"));
                    break;
                case 5:
                    organismChoice.addBehaviors(new Behaviors("Memory Erasure"));
                    break;
                case 0:
                    return;
            }
        }
    }

    public static void acceleratedGrowth(){
        System.out.println("Do you want Accelerated Growth?");
        System.out.println(" ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        System.out.println("0) Back");
        System.out.println("================");
        int growthInput = input.nextInt();

        switch (growthInput){
            case 1:
                organismChoice.setAcceleratedGrowth(true);
                break;
            case 2:
                break;
            case 0:
                break;
        }
    }

    public static void transportPackage(){
        System.out.println("================");
        System.out.println("1) Class I");
        System.out.println("2) Class II");
        System.out.println("3) Class III");
        System.out.println("4) Class IV");
        System.out.println("0) Back");
        System.out.println("================");
        int transportInput = input.nextInt();

        switch (transportInput){
            case 1:
                order.setTransportPackage(new TransportPackage(Size.SMALL));
                System.out.println(order.getOrderSummary());
                break;
            case 2:
                order.setTransportPackage(new TransportPackage(Size.MEDIUM));
                System.out.println(order.getOrderSummary());
                break;
            case 3:
                order.setTransportPackage(new TransportPackage(Size.LARGE));
                System.out.println(order.getOrderSummary());
                break;
            case 4:
                order.setTransportPackage(new TransportPackage(Size.EXTRA_LARGE));
                System.out.println(order.getOrderSummary());
                break;
            case 0:
                break;
        }
    }

    public static void maintenanceKit(){
        System.out.println("Do you want to add a Maintenance Kit?");
        System.out.println(" ");
        System.out.println("1) Yes");
        System.out.println("2) No");
        System.out.println("0) Back");
        System.out.println("================");
        int maintenanceInput = input.nextInt();
        switch (maintenanceInput){
            case 1:
                order.setMaintenance(new Maintenance());
                System.out.println(order.getOrderSummary());
                break;
            case 2:
                break;
            case 0:
                break;
        }
    }

    public static void Checkout(){
        System.out.println(order.getOrderSummary());
        confirmOrder();
    }

    public static void confirmOrder(){
        System.out.println("Are you sure you want to Check Out?");
        System.out.println("1) Yes - Confirm");
        System.out.println("2) No - Cancel Order");
        int checkoutInput = input.nextInt();

        switch (checkoutInput){
            case 1:
                ReceiptWriter.receipt(order);
                break;
            case 2:
                cancelOrder();
                break;
        }
    }
    public static void cancelOrder(){
        order.cancelOrder();
    }
    }




