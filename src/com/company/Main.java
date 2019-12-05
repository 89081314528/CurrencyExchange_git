package com.company;

import java.util.List;

/**
 * создать классы с деньгами (с ДВУМЯ конструкторами, в которые передаются деньги в валюте и условных единицах),
 * которые реализуют интерфейс мани с методом amount, который будет возвращать количестево денег в условных единицах
 * сделать класс сумма, который будет принимать интерфейс мани, и будет выдавать сумму денег в условных единицах
 * использовать это для того, чтобы переводить одни деньги в другие.
 *
 * сделать систему для перевода метров в сантиметры, дюймы версты. чтобы все могло переводиться во все.
 */
public class Main {

    public static void main(String[] args) {
        // или рубли или деньги. таким образом деньги переврдятся в у е
        Rub rub = new Rub(new Usd(1) );
        Usd usd = new Usd(1);
        Eur eur = new Eur(1);
        Jpy jpy = new Jpy(1);
        List<Money> moneyList = List.of(
                rub,
                usd,
                eur,
                jpy
        );
        Sum sum = new Sum(moneyList);
        System.out.println("sum.amountInConventionalUnit() = " + sum.amountInConventionalUnit());
        //sum реализует интерфейс money, значит, сумма это мани
        Rub total  = new Rub (sum);
        System.out.println(total.amountInUnit());

        System.out.println(rub.getAmount());
    }
}