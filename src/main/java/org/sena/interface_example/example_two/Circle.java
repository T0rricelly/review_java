package org.sena.interface_example.example_two;

public class Circle implements Figure, Drawable, Rotable{
    private double ratio;

    public Circle(double ratio){
        this.ratio = ratio;
    }

    @Override
    public double calculateArea(){
        double pi = 3.14;
        double result = pi * ratio * ratio;
        return result;
    }

    @Override
    public void draw(){
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotate(){
        System.out.println("Estoy rotando un circulo");
    }
}
