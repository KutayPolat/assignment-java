package ca.ciccc.assignment5.main.problem2.product;

import java.util.ArrayList;
import java.util.List;

public class ProductApplication {

    public void runApplication(){
        Product product1 = new Product("MacBook",1399.99);
        Product product2 = new Product("Iphone12",799.00);
        Product product3 = new Product("Case",50.0);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        Invoice invoice = new Invoice(productList);
        invoice.printProduct();
        invoice.printAllPrice();
    }
}
