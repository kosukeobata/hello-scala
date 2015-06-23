package com.example.scala.person


class Person(val name: String, val age: Int, val friends: List[String] = List[String]()) {

  def introduce(): Unit = {
    printf("私の名前は%sです。年齢は%dです。\n", name, age)
  }

  def getAge: Int = age - 2

  def is年上(other: Person): Boolean = {
    age < other.age
  }

  def addFriend(friend: String): Person = {
    new Person(name, age, friend :: friends)
  }

  def showFriends(): Unit = {
    friends.foreach(x => println(x))
  }

  def showFriendsWithSwimmy(): Unit = {
    friends.map(x => "Swimmy " + x).foreach(println)
  }

  def showFriendsWithoutハガー(): Unit = {
    friends.filter(_ != "ハガー").foreach(println)
  }

}


object PersonMain {

  def main (args: Array[String]) {
    new Person("たなか", 29, List[String]())
    val person = new Person("たなか", 29, List("安田くん"))
    person.introduce()
    val newTanaka = person.addFriend("ハガー")

    person.showFriends()
    newTanaka.showFriends()
    newTanaka.showFriendsWithSwimmy()
    newTanaka.showFriendsWithoutハガー()
  }

}

