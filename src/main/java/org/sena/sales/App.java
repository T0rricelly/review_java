package org.sena.sales;

public class App {
    public static void main(String[] args) {
        Product cellphone = new Product("Xiaomi", 300.1d);
//        System.out.println(cellphone);
        Product charger = new Product("ugreen", 30.0d);
//        System.out.println(charger);
        Order order1 = new Order();
        order1.addProduct(cellphone);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.addProduct(charger);
        order1.showOrder();
        System.out.println("El total es : " + order1.calculateTotal());
    }
}
