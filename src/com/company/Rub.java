package com.company;
public class Rub implements Money{
    private final Integer amount;
    private final Integer courseInConventionalUnit;
    // ничего, что я сумму и курс в у е в один конструктор положила?

    public Rub(Integer amount, Integer courseInConventionalUnit) {
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
