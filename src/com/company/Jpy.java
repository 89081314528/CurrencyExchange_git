package com.company;

public class Jpy implements Money{
    private final Long amount;

    public Jpy(Integer jpy) {
        this.amount = Long.valueOf(jpy * 1);
    }
    public Jpy(Money money) {
        this.amount = money.amountInConventionalUnit();
    }

    public Long getAmount() {
        return amount;
    }

    @Override
    public Long amountInConventionalUnit() {
        return amount;
    }
    public Long amountInUnit() {
        return amount / 1;
    }

}
