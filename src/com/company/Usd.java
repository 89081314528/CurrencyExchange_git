package com.company;

public class Usd implements Money{
    private final Integer amount;
    private final Integer courseInConventionalUnit;

    public Usd(Integer amount, Integer courseInConventionalUnit) {
        this.amount = amount;
        this.courseInConventionalUnit = courseInConventionalUnit;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getCourseInConventionalUnit() {
        return courseInConventionalUnit;
    }

    @Override
    public Integer amountInConventionalUnit() {
        return amount * courseInConventionalUnit;
    }
}

