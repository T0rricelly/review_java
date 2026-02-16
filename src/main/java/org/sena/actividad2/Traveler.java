package org.sena.actividad2;

public class Traveler {
    private int document;
    private String names;
    private String last_names;
    private String email;
    private int age;
    private String startLocation;
    private String endLocation;
    private boolean isForeign;
    private boolean isPregnant;


    public Traveler(int document, String names, String last_names, String email, int age, String startLocation, String endLocation, boolean isForeign, boolean isPregnant) {
        this.document = document;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.age = age;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.isForeign = isForeign;
        this.isPregnant = isPregnant;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public boolean getisPregnant() {
        return isPregnant;
    }

    public void setPregnant(boolean pregnant) {
        isPregnant = pregnant;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public void setForeign(boolean foreign) {
        isForeign = foreign;
    }

    @Override
    public String toString() {
        return "Traveler{" +
                "\ndocument=" + document +
                ",\nnames='" + names + '\'' +
                ",\nlast_names='" + last_names + '\'' +
                ",\nemail='" + email + '\'' +
                ",\nage=" + age +
                ",\nstartLocation='" + startLocation + '\'' +
                ",\nendLocation='" + endLocation + '\'' +
                ",\nisForeign=" + isForeign +
                ",\nisPregnant=" + isPregnant +
                "\n}";
    }
}
