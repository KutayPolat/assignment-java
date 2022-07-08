package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Food extends Product {

    private ArrayList<String> ingredients;
    private Integer size;
    private Integer calorie;

    public Food() {
    }

    public Food(Integer id, String name, Float price, String madeInCountry, ArrayList<String> ingredients, Integer size, Integer calorie) {
        super(id, name, price, madeInCountry);
        this.ingredients = ingredients;
        this.size = size;
        this.calorie = calorie;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }
}
