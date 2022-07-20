package ca.ciccc.assignment8.question2;

public abstract class Shape2 {
    public Question2.ShapeType shapes;
    int[] sides;

    public Shape2(Question2.ShapeType shapes, int[] sides) {
        this.shapes = shapes;
        this.sides = sides;

    }

    public abstract float perimeter();

    public abstract float area();


}
