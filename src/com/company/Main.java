package com.company;

import java.util.List;

/**
 * создать классы с деньгами (с двумя конструкторами, в которые передаются деньги в валюте и условных единицах),
 * которые реализуют интерфейс мани с методом amount, который будет возвращать количестево денег в условных единицах
 * сделать класс сумма, который будет принимать интерфейс мани, и будет выдавать сумму денег в условных единицах
 * использовать это для того, чтобы переводить одни деньги в другие
 */
public class Main {

    public static void main(String[] args) {
        Rub rub = new Rub(1, 2);
        Usd usd = new Usd(1, 128);
        Eur eur = new Eur(1, 140);
        Jpy jpy = new Jpy(1, 1);
        List<Money> moneyList = List.of(
                rub,
                usd,
                eur,
                jpy
        );
        Sum sum = new Sum(moneyList);
        System.out.println("sum.amountInConventionalUnit() = " + sum.amountInConventionalUnit());
        System.out.println(convertToRub(rub, sum));
    }

    public static Integer convertToRub(Rub rub, Sum sum) {
        return sum.amountInConventionalUnit() / rub.amountInConventionalUnit();
    }
}