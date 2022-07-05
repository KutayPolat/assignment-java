package ca.ciccc.assignment5.main.problem2.program;

public class ProgramApplication {
    public void runApplication(){
        Program program = new Program("print 1");
        program.Printer();
        Program program1 = new Program("print 2");
        program1.Printer();

        Calculator calculator = new Calculator(2, 3, "+");
        calculator.Operation();
        Calculator calculator1 = new Calculator(5, 3, "-");
        calculator1.Operation();
        Calculator calculator2 = new Calculator(3, 2, "*");
        calculator2.Operation();
        Calculator calculator3 = new Calculator(6, 2, "/");
        calculator3.Operation();
    }
}
