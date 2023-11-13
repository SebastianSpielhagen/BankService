package org.spielhagen;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Create a new client
        Client client = new Client("Dagobert", "Duck", "C12345");

        // Create a new account for the client
        Account account = new Account("A4711", BigDecimal.valueOf(1000.0), client);

        // Print the client and account details
        System.out.println("Kunde: " + account.getCustomer().getFirstName() + " " + account.getCustomer().getLastName());
        System.out.println("Kontonummer: " + account.getAccountNumber());
        System.out.println("Kontostand: " + account.getAccountBalance());
        System.out.println("Spenden sind jederzeit willkommen! :-)");
    }
}