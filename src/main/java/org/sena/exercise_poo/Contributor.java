package org.sena.exercise_poo;

public abstract class Contributor {
    // Atributos de los aportante
    private long id;
    private static int countContributor;
    private String name;
    private double ibc;

    // Constructor para heredar atributos
    public Contributor(String name, double ibc) {
        this.id = ++countContributor;
        this.name = name;
        this.ibc = ibc;
    }

    // Metodo de aportes de salud y pension
    abstract double contributions();

    // Getters y Setters
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIbc() {
        return ibc;
    }

    public void setIbc(double ibc) {
        this.ibc = ibc;
    }
}
