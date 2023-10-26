package org.example;
import java.time.LocalDate;

public class Main {
    private double balance;

    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getAmount() {
        return balance;
    }
}

