package com.company;

public class Usd implements Money, Unit{
    private final Long amount;

    public Usd(Integer dollar) {
        this.amount = Long.valueOf(dollar * 128);
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
    @Override
    public Long amountInUnit() {
        return amount / 128;
    }

}

