package com.pluralsight.order;

import com.pluralsight.Credits;
import com.pluralsight.creature.Organism;

import java.util.ArrayList;

public class Order {
    private ArrayList<Organism> creature;
    private TransportPackage transportPackage;
    private Maintenance maintenance;

    public Order() {
        this.creature = new ArrayList<>();
        this.transportPackage = null;
        this.maintenance = null;
    }

    public void addOrganism(Organism singleCreature) {
        creature.add(singleCreature);
    }

    public void setTransportPackage(TransportPackage transportPackage) {
        this.transportPackage = transportPackage;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public void cancelOrder(){
        creature.clear();
        transportPackage = null;
        maintenance = null;
    }

    public Credits getTotal() {
        Credits total = new Credits(0);
        for (Organism singleCreature : creature) {
            total = total.add(singleCreature.getPrice());
        }
        if (transportPackage != null) {
            total = total.add(transportPackage.getPrice());
        }
        if (maintenance != null) {
            total = total.add(maintenance.getPrice());
        }
        return total;
    }

    public String getOrderSummary() {

        StringBuilder newString = new StringBuilder();
        for (Organism stringOrganism : creature) {
            newString.append(stringOrganism).append("\n\n");
        }
        if (maintenance != null) {
            newString.append("Maintenance: ").append(maintenance).append("\n");
        }
        if (transportPackage != null) {
            newString.append("Transport package: ").append(transportPackage).append("\n");


        }

        return "===========================" + "\n" +
                "HELIX BIOWORKS " + "\n" +
                "===========================" + "\n" +
                newString + "\n" +
                "Total: " + getTotal() + "\n" +
                " " + "\n\n";
    }
}