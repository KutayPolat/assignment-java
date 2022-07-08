package ca.ciccc.assignment6.problem1;

public class Drink extends Product {

    private Boolean isDrinkDiet;
    private Integer size;

    public Drink () {}

    public Drink(Integer id, String name, Float price, String madeInCountry, Boolean isDrinkDiet, Integer size) {
        super(id, name, price, madeInCountry);
        this.isDrinkDiet = isDrinkDiet;
        this.size = size;
    }

    public Boolean getDrinkDiet() {
        return isDrinkDiet;
    }

    public void setDrinkDiet(Boolean drinkDiet) {
        isDrinkDiet = drinkDiet;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
