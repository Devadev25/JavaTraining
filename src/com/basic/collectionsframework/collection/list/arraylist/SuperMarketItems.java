package com.basic.collectionsframework.collection.list.arraylist;

class SupermarketItem {
    private String name;
    private double price;

    public SupermarketItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f", name, price);
    }


}


