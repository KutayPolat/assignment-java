package ca.ciccc.assignment5.main.problem2.product;

import java.util.List;

public class Invoice {

    private List<Product> products;
    private Double totalPrice;

    public Invoice(List<Product> products) {
        this.products = products;
        double total = 0;
        if (products.size() > 0){
            for (Product product: getProducts()){
                total += product.getPrice();
            }
        }
       this.totalPrice = total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void printAllPrice(){
        System.out.println("======Total price of All product =====");
        System.out.println(getTotalPrice());

    }

    public void printProduct(){
        System.out.println("====All Product and price====");
        for (Product product: getProducts()){
            System.out.println("Product Name : " + product.getName());
            System.out.println("Product Price : " + product.getPrice());
        }
    }
}
