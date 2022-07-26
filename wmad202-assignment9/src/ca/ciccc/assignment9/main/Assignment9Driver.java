package ca.ciccc.assignment9.main;

import ca.ciccc.assignment9.problem1.FunctionalApplication;
import ca.ciccc.assignment9.problem2.CustomImplementation;

public class Assignment9Driver {
    public static void run() {
        FunctionalApplication application = new FunctionalApplication();
        application.runApp();
        System.out.println();
        System.out.println("****** Custom Functional Interface ******");
        CustomImplementation customImplementation = new CustomImplementation();
        customImplementation.runCustom();
    }
}
