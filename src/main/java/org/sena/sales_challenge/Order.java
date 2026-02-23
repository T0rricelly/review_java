package org.sena.sales_challenge;

public class Order {
    private final int id_order;
    private static int set_id;
    private Product[] products;
    private int count_product;
    private static final int MAX_PRODUCTS = 10;

    public Order(){
        this.id_order = ++Order.set_id;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    // Methods
    public void addProduct(Product product) {
        if (this.count_product < Order.MAX_PRODUCTS){
            products[this.count_product++] = product;
        }else{
            System.out.println("Ha alcanzado el limite de productos");
        }
    }
    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < products.length; i++){
            Product product = this.products[i];
            total += product.getPrice();
        }
        return total;
    }

    public void showOrder(){
        System.out.println("Id Orden: " + this.id_order);
        System.out.println("Total de la orden: $" + this.calculateTotal());
        System.out.println("Productos de la orden");
        for (int i = 0; i < this.products.length; i++){
            System.out.println(this.products[i]);
        }
    }
}
