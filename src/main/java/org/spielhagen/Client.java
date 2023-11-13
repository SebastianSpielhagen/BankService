package org.spielhagen;

public record Client(String firstName, String lastName, String customerNumber) {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
