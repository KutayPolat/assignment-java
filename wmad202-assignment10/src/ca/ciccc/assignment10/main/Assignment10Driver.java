package ca.ciccc.assignment10.main;

import ca.ciccc.assignment10.problem3.Predicate1Exception;
import ca.ciccc.assignment10.problem3.Predicate2Exception;
import ca.ciccc.assignment10.problem3.TestExceptions2;

public class Assignment10Driver {
    public static void run(){
        try {
            TestExceptions2.test();
        } catch (Predicate1Exception e) {
            System.out.println(e.getMessage());
        } catch (Predicate2Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
