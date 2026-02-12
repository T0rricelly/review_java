package org.sena.challenge;

public class Player extends Person {
    private int numberPlayer;
    private String rolePlayer;
    private int amountPoints;
    private String team;

    // Builder
    public Player(String name, int age, int numberPlayer, String rolePlayer, String team) {
        super(name, age);
        this.numberPlayer = numberPlayer;
        this.rolePlayer = rolePlayer;
        this.team = team;
        this.amountPoints = 0;
    }

    // Methods
    public void scorePoint(int point) {
        amountPoints += point;
        System.out.println("El jugador " + getName() + " con el numero " + numberPlayer + " ha anotado " + point + ((point == 1) ? " punto" : " puntos"));
    }

    public void statistics() {
        System.out.println("El jugador " + getName() + " con el numero " + numberPlayer + " tiene " + amountPoints + " puntos");
    }
    @Override
    public void presented(){
        System.out.println("Hola soy el jugador " + getName() + " y juego de " + getRolePlayer());
    }

    // Getters and Setter

    public int getNumberPlayer() {
        return this.numberPlayer;
    }

    public void setNumberPlayer(int numberPlayer){
        this.numberPlayer = numberPlayer;
    }

    public String getRolePlayer() {
        return this.rolePlayer;
    }

    public void setRolePlayer(String rolePlayer) {
        this.rolePlayer = rolePlayer;
    }

    public int getAmountPoints() {
        return this.amountPoints;
    }

    public void setAmountPoints(int amountPoints) {
        if (amountPoints < 0) {
            System.out.println("No puedes asignar puntos negativos");
        } else {
            this.amountPoints = amountPoints;
        }
    }

    public String getTeam(){
        return  this.team;
    }

    public void setTeam(String team){
        this.team = team;
    }
    @Override
    public String toString(){
        return "Nombre: " + getName() + " edad: " + getAge() + " equipo: " + getTeam();
    }

}
