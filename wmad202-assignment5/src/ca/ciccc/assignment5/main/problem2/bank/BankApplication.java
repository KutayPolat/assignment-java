package ca.ciccc.assignment5.main.problem2.bank;

public class BankApplication {
    public void runApplication() {
        Transaction transaction = new Transaction("999" , 2.02F);
        Statement statement = new Statement();
        statement.addTransaction(transaction);
        Transaction transaction1 = new Transaction("999" , 2.02F);
        statement.addTransaction(transaction1);
        statement.totalBalance();
    }
}
