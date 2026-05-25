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
        return "===========================" + "\n" +
                "HELIX BIOWORKS " + "\n" +
                "===========================" + "\n" +
                creature + "\n" +
                "Transport package: " + transportPackage + "\n" +
                "Maintenance: " + maintenance + "\n" +
                "Total: " + getTotal();
    }
}