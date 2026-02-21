package org.sena.abstract_class;

public class App {
    public static void main(String[] args) {
        Figure figure = new Rectangle();
        figure.draw();

        Figure circle = new Circle();
        circle.draw();
    }
}
