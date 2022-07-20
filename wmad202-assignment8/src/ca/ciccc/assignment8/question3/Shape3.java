package ca.ciccc.assignment8.question3;

public abstract class Shape3 {
    public Question3.ShapeType shapes;
    int[] sides;

    public Shape3(Question3.ShapeType shapes, int[] sides) {
        this.shapes = shapes;
        this.sides = sides;

    }

    public abstract float perimeter();

    public abstract float area();



}
