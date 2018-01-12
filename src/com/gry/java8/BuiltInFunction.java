package com.gry.java8;

import java.util.Objects;
import java.util.function.Predicate;

public class BuiltInFunction {

    /*
    * JDK 1.8 API中包含了很多内置的函数式接口。
    * 有些是在以前版本的Java中大家耳熟能详的，例如Comparator接口，或者Runnable接口。
    * 对这些现成的接口进行实现，可以通过@FunctionalInterface 标注来启用Lambda功能支持。
    * */

    /*
    * Predicates
    *  Predicate是一个布尔类型的函数，该函数只有一个输入参数。Predicate接口包含了多种默认方法，用于处理复杂的逻辑动词（and, or，negate）
    * */

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();
    }

}
