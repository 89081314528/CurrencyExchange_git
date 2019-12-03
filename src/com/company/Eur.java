package com.company;

public class Eur implements Money {
    private final Long amount;

    public Eur(Integer eur) {
        this.amount = Long.valueOf(eur * 140);
    }
    public Eur(Money money) {
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
        return amount / 140;
    }

}
