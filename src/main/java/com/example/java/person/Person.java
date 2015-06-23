package com.example.java.person;


import java.util.ArrayList;
import java.util.List;


public class Person {

    // メンバ変数
    private String name;
    private int age;
    private List<String> friends;


    // コンストラクタ
    public Person(String name, int age, List<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
    }

    // メソッド
    public void introduce() {
        System.out.printf("私の名前は%sです。年齢は%dです。", name, age);
    }

    public void showFriends() {
        friends.stream().forEach(System.out::println);
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }
}

