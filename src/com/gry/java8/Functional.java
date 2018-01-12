package com.gry.java8;

/*
* 函数式接口
* */
public class Functional {

    public static void main(String[] args) {
        /*
        * 以下的操作相当于是给这个接口的方法绑定一个实现。
        *Java 8 允许你通过::关键字获取方法或者构造函数的的引用。
        *
        *   第一个lamda表达式
        *   第二个是绑定了Jdk中Integer类的静态方法。
        *   第三四个是绑定了自定义的类中的普通方法，需要使用Something的实例。
        * */

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123


        Converter<String, Integer> converter1 = Integer::valueOf;
        converted = converter1.convert("123");
        System.out.println(converted);   // 123

        Something something = new Something();
        Converter<String, String> converter2 = something::startsWith;
        String converted2 = converter2.convert("Java");
        System.out.println(converted2);    // "J"

        Converter<Integer,String> converter3 = something::test1;
        System.out.println(converter3.convert(1));
    }

}

/*
* 这个接口中只能定义一个方法
* 通过@FunctionalInterface 标注来启用Lambda功能支持。
* */
@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
   // T converts(F from);
}

class Something {
    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    String test1(Integer i){
        return "hahaha";
    }
}