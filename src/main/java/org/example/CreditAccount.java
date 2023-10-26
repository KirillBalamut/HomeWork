package org.example;

public class CreditAccount extends Account {
    @Override
    public void take(double amount) {
        double commission = amount * 0.01;
        super.take(amount + commission);
    }
}
