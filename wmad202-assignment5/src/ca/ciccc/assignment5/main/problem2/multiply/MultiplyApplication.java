package ca.ciccc.assignment5.main.problem2.multiply;

public class MultiplyApplication {
    public void runApplication(){
        Multiply multiply = new Multiply();
        multiply.showQuestion("WITCH IS ANIMAL WHO STAY IN WATHER?");
        multiply.giveChoices("CAT", "COW", "FISH", "DOG");
        multiply.checkChoice("c", "b");
        multiply.checkChoice("c", "c");
        multiply.checkChoice("c", "d");
        multiply.checkChoice("c", "a");
        multiply.showTheAnswer("c");
    }

}
