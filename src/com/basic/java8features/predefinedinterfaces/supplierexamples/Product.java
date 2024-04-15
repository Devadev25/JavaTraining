package com.basic.java8features.predefinedinterfaces.supplierexamples;

public class Product {
    private  int id;
    private String name;
    private  float price;

    public Product( int id, String name, float price){
        this.id =id;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product { " +
                " id = " + id +
                ", name = '" + name + '\'' +
                ", price = " + price +
                " }";
    }
}
