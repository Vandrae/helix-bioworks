package com.pluralsight;

import com.pluralsight.creature.*;

public class TestMain {
    public static void main(String[] args) {

        Credits price = new Credits(2.50);
        System.out.println("Credits Test: " + price);

        Genome genome = Genome.REPTILIAN;
        System.out.println("Genome Test: " + genome);

        Scale scale = Scale.CLASS_III;
        System.out.println("Scale Test: " + scale);

        OffensiveAdaptation offensiveAdaptation = new OffensiveAdaptation("Venom Glands", new Credits(500), true);
        System.out.println("Adaptation Test: " + offensiveAdaptation);
        System.out.println(offensiveAdaptation.getPrice(Scale.CLASS_I));
        System.out.println(offensiveAdaptation.getPrice(Scale.CLASS_III));

        StandardMod  standardMod = new StandardMod("Pack Tactics");
        System.out.println("StandardMod Test: " + standardMod);

        Behaviors behaviors = new Behaviors("Aggression Targeting");
        System.out.println("Conditioning Test: " + behaviors);

    }
}
