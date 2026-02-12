package org.sena.sales;

public class Product {
    private final int id_product;
    private String name;
    private double price;
    private static int count_product;

    // Build
    public Product( String name, double price){
        this.id_product = ++Product.count_product;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getIdProduct(){
        return this.id_product;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "{\n Id_product = " +
                this.id_product + ",\n" +
                " name = " +
                this.name + ",\n" +
                " price " +
                this.price + " \n}";
    }
}
