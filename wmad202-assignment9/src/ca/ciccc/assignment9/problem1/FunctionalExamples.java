package ca.ciccc.assignment9.problem1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalExamples {

    //In Java 8, Consumer is a functional interface; it takes an argument and returns nothing.
    public void printConsumer(String a){
        Consumer<String> print = x -> System.out.println(x);
        print.accept(a);
    }

    //In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing.
    public  <T> void biConsumeCalculate(Integer x , Integer y){
        BiConsumer<Integer, Integer> c1 = (a, b) -> System.out.println(a + b);
        // Very basic usage of BiFunction accept
        System.out.println("A + B : ");
        c1.accept(x, y);

        BiConsumer<Integer, Integer> c3 = (a, b) -> System.out.println(a * b);
        // c1.andThen(c2); can not apply incompatible types Integer and String
        System.out.println("A + B then A * B : " );
        c1.andThen(c3).accept(x, y);

    }

    //In Java 8, Function is a functional interface; it takes an argument (object of type T) and returns an object (object of type R).
    // The argument and output can be a different type.
    public void chainFunction(String a){

        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply(a);

        System.out.println(result);
    }

    //In Java 8, BiFunction is a functional interface; it takes two arguments and returns an object.
    public <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double, R> func2) {

        return func.andThen(func2).apply(a1, a2);

    }

    //The BinaryOperator takes two arguments of the same type and returns a result of the same type of its arguments.
    public <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }

    //In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean.
    // Usually, it used to apply in a filter for a collection of objects.
    public void filterWithPredicate(List<Integer> list){

        // multiple filters
        List<Integer> collect = list.stream()
                .filter(x -> x > 5 && x < 8).collect(Collectors.toList());

        System.out.println(collect);
    }

    //In Java 8, BiPredicate is a functional interface, which accepts two arguments and returns a boolean, basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.
    public Boolean predicateLength(String word, Integer length){

        BiPredicate<String, Integer> filter = (x, y) -> {
            return x.length() == y;
        };


        boolean result = filter.test(word, length);
        return result;
    }

    //In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.
    public void printCurrentDate(){
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);
    }
    //in Java 8, BooleanSuppliers represents a function which does not take in any argument but produces a boolean value.
    public Boolean isDivisible(int a, int b){
        BooleanSupplier evenBs = () -> {
            if (a % b == 0) {
                return true;
            }
            return false;
        };
        return evenBs.getAsBoolean();
    }

    //In Java 8, UnaryOperator is a functional interface and it extends Function.
    //The UnaryOperator takes one argument, and returns a result of the same type of its arguments.
    public void placeWithUnary(Integer a){
        //the Function<Integer, Integer> which accepts and returns the same type, can be replaced with UnaryOperator<Integer>.
        Function<Integer, Integer> func = x -> x * 2;

        Integer result = func.apply(a);

        System.out.println("function result : " + result);

        UnaryOperator<Integer> func2 = x -> x * 2;

        Integer result2 = func2.apply(a);

        System.out.println("unary operator placed same result : " + result2);
    }

}
