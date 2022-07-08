package ca.ciccc.assignment6.problem2;

import ca.ciccc.assignment6.problem1.Product;

public interface IShoppingCart {

    Integer addItem(Product product);
    Float totalAmountCart();
    void printProductOnCart();
}
