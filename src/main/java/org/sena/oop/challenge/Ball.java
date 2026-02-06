package org.sena.oop.challenge;

public class Ball {
    private String brand;
    private float pressure;
    private boolean isInflated;

    // Builder
    public Ball(String brandBall) {
        brand = brandBall;
        pressure = 7.5f;
        isInflated = true;
    }

    // Methods
    void bounce() {
        if (isInflated) {
            System.out.println("Boing, boing");
            pressure -= 1.0f;
            if (pressure < 5.0) {
                System.out.println("El balon se ha desinflado");
                isInflated = false;
            }
        } else {
            System.out.println("El balon no rebota");
        }
    }

    // Getters and Setters
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPressure() {
        return this.pressure;
    }

    public void setPressure(float pressure) {
        if (pressure >= 0.0f && pressure <= 1.0f) {
            this.pressure = pressure;
        }
        else{
            System.out.println("La presion no es valida");
        }
    }

    public boolean isInflated() {
        return this.isInflated;
    }

    public void setInflated(boolean inflated) {
        isInflated = inflated;
    }

    public static void main(String[] args) {
        Ball ball1 = new Ball("Wilson");
        ball1.bounce();
        ball1.bounce();
        ball1.bounce();
        ball1.bounce();
        ball1.bounce();
    }
}
