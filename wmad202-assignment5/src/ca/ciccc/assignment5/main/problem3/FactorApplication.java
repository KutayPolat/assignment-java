package ca.ciccc.assignment5.main.problem3;

public class FactorApplication {
    public void run() {
        SinglePolynomialFactor factor1= new SinglePolynomialFactor(4,"x",2);
        SinglePolynomialFactor factor2= new SinglePolynomialFactor(4,"x",2);

        String factor= factor1.getSinglePolynomialFactor();
        String factor22= factor2.getSinglePolynomialFactor();

        PolynomialFactor factor3= new PolynomialFactor();
        factor3.addSinglePolynomialFactor(factor1,0);
        factor3.addSinglePolynomialFactor(factor2,1);

        System.out.println(factor3.getPolynomialFactor());



        System.out.println(factor);
        System.out.println(factor22);
    }
}
