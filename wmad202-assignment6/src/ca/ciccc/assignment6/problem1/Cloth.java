package ca.ciccc.assignment6.problem1;

import java.util.ArrayList;

public class Cloth extends Product {

    private ArrayList<Material> materials;

    public Cloth() {
    }

    public Cloth(Integer id, String name, Float price, String madeInCountry, ArrayList<Material> materials) {
        super(id, name, price, madeInCountry);
        this.materials = materials;
    }

    public ArrayList<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<Material> materials) {
        this.materials = materials;
    }
}
