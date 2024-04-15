package com.basic.java8features.predefinedinterfaces.supplierexamples;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Amazon {
    public static void main(String[] args) {
        try {
            Supplier<LocalDateTime> details = () -> LocalDateTime.now();
            System.out.println(details.get());

            Supplier<List<Product>> productSupplier = () -> {
                List<Product> productList = new ArrayList<Product>();
                productList.add(new Product(1, "HP", 45999.12f));
                productList.add(new Product(2, "Iphone", 100509f));
                productList.add(new Product(3, "Jeans", 999f));
                productList.add(new Product(4, "Shoes", 1450f));
                productList.add(new Product(5, "Refrigerator", 75000f));
                return productList;
            };
            productSupplier.get().forEach(product -> System.out.println(product.toString()));
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
