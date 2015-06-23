package com.example.java.person;


public class Person {

    // メンバ変数
    private String name;
    private int age;


    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void introduce() {
        System.out.printf("私の名前は%sです。年齢は%dです。", name, age);
    }

}

