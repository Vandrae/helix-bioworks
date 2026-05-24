package com.pluralsight.creature;

import com.pluralsight.Credits;

import java.util.ArrayList;

public class Organism {
    private ArrayList<OffensiveAdaptation> weapons;
    private ArrayList<DefensiveAdaptation> defenses;
    private ArrayList<StandardMod> mods;
    private ArrayList<Behaviors> behaviors;
    private Genome genome;
    private Scale scale;
    boolean acceleratedGrowth;

    //methods
    public Credits getPrice(){
        //base price+class+defensive+offensive = total
        Credits total = scale.getBasePrice();
        int wepCount = 0;
        int defCount = 0;
        //loop thrugh each item on the list then get the price of each weapon and add it to
        // the price of the creature's size
        for (OffensiveAdaptation weapon: weapons){
            if (wepCount <= 2){
                total = total.add(weapon.getPrice(scale));
            } else {
                //compounding price if there are more than 3 adaptations on a single creature
                total = new Credits(total.getAmount() * weapon.getPrice(scale).getAmount());
            }
            wepCount += 1;
        }

        for (DefensiveAdaptation defense: defenses){
            if (defCount <= 2){
                total = total.add(defense.getPrice(scale));
            } else {
                total = new Credits(total.getAmount() * defense.getPrice(scale).getAmount());
            }
            defCount += 1;
        }

        if (acceleratedGrowth == true){
            //converting the product of amount a nd 1.15 back to a credit so it can be used
            total = new Credits(total.getAmount() * 1.15);
        }
        return total;
    }



    //constructor should have empty lists on it because we will populate them later
    public Organism(Genome genome, Scale scale, boolean acceleratedGrowth) {
        this.weapons = new ArrayList<>();
        this.defenses = new ArrayList<>();
        this.mods = new ArrayList<>();
        this.behaviors = new ArrayList<>();
        this.genome = genome;
        this.scale = scale;
        this.acceleratedGrowth = acceleratedGrowth;
    }

    //getter/setter
    public Genome getGenome() {
        return genome;
    }

    public void setGenome(Genome genome) {
        this.genome = genome;
    }

    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public boolean isAcceleratedGrowth() {
        return acceleratedGrowth;
    }

    //add to arraylist
    public void setAcceleratedGrowth(boolean acceleratedGrowth) {
        this.acceleratedGrowth = acceleratedGrowth;
    }

    public void addWeapons(OffensiveAdaptation singleWeapon) {
        weapons.add(singleWeapon);
    }

    public ArrayList<OffensiveAdaptation> getWeapons() {
        return weapons;
    }

    public void addDefenses(DefensiveAdaptation singleDefense) {
        defenses.add(singleDefense);
    }

    public ArrayList<DefensiveAdaptation> getDefenses() {
        return defenses;
    }

    public void addMods(StandardMod singleMod) {
        mods.add(singleMod);
    }

    public ArrayList<StandardMod> getMods() {
        return mods;
    }

    public void addBehaviors(Behaviors singleBehavior) {
        behaviors.add(singleBehavior);
    }

    public ArrayList<Behaviors> getBehaviors() {
        return behaviors;
    }

}
