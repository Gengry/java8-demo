package com.gry.java8;

/*
* Jdk8 支持接口中存在默认实现，使用default关键字。
* */
public class DefaultMethod {

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.sqrt(16));           // 4.0

    }

}

interface Formula {
    double calculate(int a);

    //默认实现
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
