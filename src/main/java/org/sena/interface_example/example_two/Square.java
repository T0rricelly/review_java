package org.sena.interface_example.example_two;

public class Square implements Figure, Drawable{
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        double result = side * side;
        return result;
    }

    @Override
    public void draw(){
        System.out.println("Estoy dibujando");
    }
}
