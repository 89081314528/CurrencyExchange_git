package com.company;
public class Rub implements Money{
    private final Long amount;
    // amount - рубли * курс

    public Rub(Integer roubles) {
        this.amount = Long.valueOf(roubles * 2);
    }

    public Rub(Money money) {
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
        return amount / 2;
    }



}
