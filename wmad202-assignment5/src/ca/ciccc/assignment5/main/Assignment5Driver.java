package ca.ciccc.assignment5.main;

import ca.ciccc.assignment5.main.problem2.mobile.MobileApplication;
import ca.ciccc.assignment5.main.problem2.multiply.MultiplyApplication;
import ca.ciccc.assignment5.main.problem1.Question1;
import ca.ciccc.assignment5.main.problem2.program.ProgramApplication;
import ca.ciccc.assignment5.main.problem2.bank.BankApplication;
import ca.ciccc.assignment5.main.problem2.book.BookApplication;
import ca.ciccc.assignment5.main.problem2.product.ProductApplication;
import ca.ciccc.assignment5.main.problem2.student.StudentApplication;
import ca.ciccc.assignment5.main.problem3.FactorApplication;

public class Assignment5Driver {
    public static void run() {

        System.out.println("*****Problem 1 ******");
        Question1 question1 = new Question1();
        question1.invoke();
        System.out.println("*****Problem 2 ******");
        System.out.println("*****Product ******");
        ProductApplication productApplication = new ProductApplication();
        productApplication.runApplication();
        System.out.println("*****Book ******");
        BookApplication bookApplication = new BookApplication();
        bookApplication.runApplication();
        System.out.println("*****Bank ******");
        BankApplication bankApplication = new BankApplication();
        bankApplication.runApplication();
        System.out.println("*****Program-Calculator ******");
        ProgramApplication programApplication = new ProgramApplication();
        programApplication.runApplication();
        System.out.println("*****Mobile ******");
        MobileApplication mobileApplication = new MobileApplication();
        mobileApplication.runApplication();
        System.out.println("*****Mobile ******");
        MultiplyApplication multiplyApplication = new MultiplyApplication();
        multiplyApplication.runApplication();
        System.out.println("*****Student ******");
        StudentApplication studentApplication = new StudentApplication();
        studentApplication.runApplication();
        System.out.println("*****Factor problem3 ******");
        FactorApplication factorApplication = new FactorApplication();
        factorApplication.run();

    }
}
