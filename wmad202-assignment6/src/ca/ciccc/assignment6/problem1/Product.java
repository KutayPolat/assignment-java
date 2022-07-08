package ca.ciccc.assignment6.problem1;

public class Product extends Object{

    private Integer id;
    private String name;
    private Float price;
    private String madeInCountry;

    public Product() { }

    public Product(Integer id, String name, Float price, String madeInCountry) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.madeInCountry = madeInCountry;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getMadeInCountry() {
        return madeInCountry;
    }

    public void setMadeInCountry(String madeInCountry) {
        this.madeInCountry = madeInCountry;
    }
}
