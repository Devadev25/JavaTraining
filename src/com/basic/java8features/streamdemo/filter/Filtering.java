package com.basic.java8features.streamdemo.filter;

import com.basic.java8features.streamdemo.filter.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) {

        List<Products> products = getProducts()
                .stream().filter((product) -> product.getPrice() > 25000f)
                .collect(Collectors.toList());
        products.forEach(System.out::println);
    }

    private static List<Products> getProducts() {
        List<Products> productList = new ArrayList<>();
        productList.add(new Products(1, "HP", 45999.12f));
        productList.add(new Products(2, "Iphone", 100509f));
        productList.add(new Products(3, "Jeans", 999f));
        productList.add(new Products(4, "Shoes", 1450f));
        productList.add(new Products(5, "Refriger", 25000f));
        return productList;
    }

}

