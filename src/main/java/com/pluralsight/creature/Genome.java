package com.pluralsight.creature;

public class Genome {
    private String Primate;
    private String Insectoid;
    private String Reptilian;
    private String Avian;
    private String Aquatic;
    private String apexPred;

    //methods

    //Constructor
    public Genome(String apexPred, String aquatic, String avian, String reptilian, String insectoid, String primate) {
        this.apexPred = apexPred;
        Aquatic = aquatic;
        Avian = avian;
        Reptilian = reptilian;
        Insectoid = insectoid;
        Primate = primate;
    }

    //Getter/Setter
    public String getPrimate() {
        return Primate;
    }

    public void setPrimate(String primate) {
        Primate = primate;
    }

    public String getInsectoid() {
        return Insectoid;
    }

    public void setInsectoid(String insectoid) {
        Insectoid = insectoid;
    }

    public String getReptilian() {
        return Reptilian;
    }

    public void setReptilian(String reptilian) {
        Reptilian = reptilian;
    }

    public String getAvian() {
        return Avian;
    }

    public void setAvian(String avian) {
        Avian = avian;
    }

    public String getAquatic() {
        return Aquatic;
    }

    public void setAquatic(String aquatic) {
        Aquatic = aquatic;
    }

    public String getApexPred() {
        return apexPred;
    }

    public void setApexPred(String apexPred) {
        this.apexPred = apexPred;
    }
}
