package com.company;

public class Usd implements Money{
    private final Long amount;

    public Usd(Integer usd) {
        this.amount = Long.valueOf(usd * 128);
    }

    public Usd(Money money) {
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
        return amount / 128;
    }

}

