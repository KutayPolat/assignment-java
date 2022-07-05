package ca.ciccc.assignment5.main.problem2.bank;

public class Transaction {
    private String id;
    private Float balance;

    public Transaction(String id, Float balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

}
