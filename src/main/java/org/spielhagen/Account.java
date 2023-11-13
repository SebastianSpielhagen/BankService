package org.spielhagen;
import java.math.BigDecimal;

public class Account {
    private String accountNumber;
    private BigDecimal accountBalance;
    private Client customer;

    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public Client getCustomer() {
        return customer;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomer(Client customer) {
        this.customer = customer;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            accountBalance = accountBalance.add(amount);
            System.out.println("Spende ist angekommen. Neuer Kontostand: " + accountBalance);
        } else {
            System.out.println("Ungültiger Einzahlungsbetrag. (ZUWENIG!)");
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0 && amount.compareTo(accountBalance) <= 0) {
            accountBalance = accountBalance.subtract(amount);
            System.out.println("Geschenk für Donald gekauft! Neuer Kontostand " + accountBalance);
        } else {
            System.out.println("Ungültiger Auszahlungsbetrag oder halt Pleite.");
        }
    }
}