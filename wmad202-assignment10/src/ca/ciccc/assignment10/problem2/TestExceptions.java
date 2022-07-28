package ca.ciccc.assignment10.problem2;

public class TestExceptions {
    class ExceptionA1 extends Exception{
        ExceptionA1(String message){
            super(message);
        }
    }

    class ExceptionA2 extends ExceptionA1 {
        ExceptionA2(String message){
            super(message);
        }
    }

    class ExceptionA3 extends ExceptionA2 {
        ExceptionA3(String message){
            super(message);
        }
    }

    class ClassA {

        public void methodA1() throws ExceptionA1 {
            System.out.println("MethodA1 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA1("Exception A1 raised!");
            }
        }

        public void methodA2() throws ExceptionA2 {
            System.out.println("MethodA2 running");
            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA2("Exception A2 raised!");
            }

        }

        public void methodA3() throws ExceptionA3 {

            System.out.println("MethodA3 running");

            double probability = Math.random();
            System.out.println(probability);

            if(probability<0.5) {
                throw new ExceptionA3("Exception A3 raised!");
            }

        }
    }

    public void testExceptions1(){
        TestExceptions.ClassA a = new ClassA();
        try {
            a.methodA1();
        } catch (ExceptionA1 e) {
            System.out.println(e.getMessage());
        }
    }

    public void testExceptions2(){

        TestExceptions.ClassA classA = new ClassA();
        int exceptionCount=0;

        try{
            classA.methodA1();
        } catch (ExceptionA1 e) {
            exceptionCount++;
            System.out.println(e.getMessage());
        }
        try{
            classA.methodA2();
        } catch (ExceptionA2 e) {
            exceptionCount++;
            System.out.println(e.getMessage());
        }
        try{
            classA.methodA3();
        } catch (ExceptionA3 e) {
            exceptionCount++;
            System.out.println(e.getMessage());
        }

        System.out.println("Total number of exceptions: "+exceptionCount);

    }


    public static void main(String[] args){

        TestExceptions test = new TestExceptions();
        test.testExceptions1();
        test.testExceptions2();
    }
}
