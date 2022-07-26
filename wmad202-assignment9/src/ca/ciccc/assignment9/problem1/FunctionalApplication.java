package ca.ciccc.assignment9.problem1;

import java.util.Arrays;

public class FunctionalApplication {
    public void runApp() {

        FunctionalExamples examples = new FunctionalExamples();

        //Consumer:
        System.out.println("***** Consumer ******");
        examples.printConsumer("Functional Interface");

        //biConsume :
        System.out.println("******** BiConsume ********");
        examples.biConsumeCalculate(10,20);

        //Function:
        System.out.println("***** Function *****");
        examples.chainFunction("kutay");

        //biFunction:
        System.out.println("******** BiFunction ********");
        String result = examples.powToString(2, 4,
                (a1, a2) -> Math.pow(a1, a2),
                (r) -> "Result : " + String.valueOf(r));
        System.out.println(result);

        //BinaryOperator:
        System.out.println("****** BinaryOperator ******");
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer result2 = examples.math(Arrays.asList(numbers), 0, Integer::sum);
        System.out.println(result2);

        //Predicate:
        System.out.println("***** Predicate ******");
        examples.filterWithPredicate(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //BiPredicate:
        System.out.println("***** BiPredicate ******");
        System.out.println("predicate length : " + examples.predicateLength("kutay",5));

        //Suppliers:
        System.out.println("****** Suppliers ******");
        examples.printCurrentDate();

        //BooleanSuppliers:
        System.out.println("****** BooleanSuppliers ******");
        System.out.println("6 is divisible by 3 : " + examples.isDivisible(6,3));

        //UnaryOperator
        System.out.println("****** UnaryOperator ******");
        examples.placeWithUnary(2);

    }
}
