package com.company;

import java.util.List;

public class Sum implements Money {
    private final List<Money> money;

    public Sum(List<Money> money) {
        this.money = money;
    }

    public List<Money> getMoney() {
        return money;
    }

    @Override
    public Long amountInConventionalUnit() {
        Long sum = Long.valueOf(0);
        for (Money currentMoney : money) {
            sum = sum + currentMoney.amountInConventionalUnit();
        }
        return sum;
    }

    @Override
    public Long amountInUnit() {
        Long sum = Long.valueOf(0);
        for (Money currentMoney : money) {
            sum = sum + currentMoney.amountInUnit();
        }
        return sum;
    }
}

