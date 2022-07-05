package ca.ciccc.assignment5.main.problem2.bank;

import java.util.ArrayList;

public class Statement {
    private ArrayList<Transaction> transactionList;

    public Statement() {
        this.transactionList = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public void totalBalance() {
        float total = 0;
        for(int i = 0; i < transactionList.size(); i++) {
            Transaction t = transactionList.get(i);
            total = total + t.getBalance();
        }
        System.out.println("TOTAL BALANCE:" + total);
    }
}
