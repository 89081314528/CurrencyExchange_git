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
    public Integer amountInConventionalUnit() {
        Integer sum = 0;
        for (Money currentMoney : money) {
            sum = sum + currentMoney.amountInConventionalUnit();
        }
        return sum;
    }
}
