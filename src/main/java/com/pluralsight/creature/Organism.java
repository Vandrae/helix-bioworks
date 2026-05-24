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
