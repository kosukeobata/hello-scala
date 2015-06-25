package com.example.scala.person

  case class Person(name: String, age: Int, friends: List[String] = Nil) {
     override def toString: String = {
      s"Person( $name, $age, $friends )"
     }

    def addFriend(friend: String): Person = {
      new Person(name, age, friend :: friends)
    }

    def showFriend(): Unit = {
      friends.foreach(println)
    }
  }

object PersonMain {
  def main (args: Array[String]): Unit = {
    val katsuo = new Person("カツオ", 23)

    katsuo.addFriend("tabe")

    val map = Map(
      ("安田" , new Person("安田", 26)),
      "安田くん" -> new Person("安田くん", 26),
      "ハガー"   -> new Person("ハガー", 22),
      "tabe少年" -> new Person("tabe少年", 27)
    )

//    map.foreach { kv =>
//      val (key , value) = kv
//      println(s"key:$key, value:$value")
//      println("key: " + key + ", value: " + value)
//    }
    val ハガー = map.get("ハガー")
    val yassan = map.get("安田")

    ハガー.map(p => p.age).foreach(println)
    val real = ハガー.getOrElse(new Person("ハガー", 26))
    println(real)

    ハガー.foreach(println)
    /* 上と下は同じ意味 */
    ハガー match {
      case Some(person) => println(person)
      case None =>
    }

    /* getメソッドはOption型で返ってくる。JavaでいうOptionalと同じ */
    val p = map.get("パセリ")
//    p.foreach(println)

    println("*** Set ***")
    val set = Set(
      new Person("安田", 24),
      new Person("ハガー", 24),
      new Person("tabe少年", 27)
    )

    val  newSet = set + new Person("ハガー", 24)
    newSet.foreach(println)

    println("*** case ***")
    val person = List(Person("ハガー", 24), Person("艦長", 24), Person("たなか", 29))
    person.foreach {
      case Person("ハガー", _, _) => println("ハガーか...")
      case Person(name, _, _) => println(s"$name さんですね")
    }

    person.foreach {
      case Person(name, age, _) if age <= 24 => println("新卒っぽい")
      case Person(name, _, _) => println(s"$name さんですね")
    }

//    def length(n: Any): Unit = {
//      case n: Boolean =>
//      case n: Int =>
//      case _ =>
//    }

    /* 多重ループ */
    for {
      i <- List(1,2,3)
      j <- List(1,2,3)
    }{
      println(i * j)
    }

    /* mapと同じ */
    val newList = for {
      i <- 0 to 10
    } yield i * 2
  }

  def showExistOnly(p: Option[Person]): Unit = {
    // 値がある場合は、Windowsを追加する。
    // さらに、友達の一覧を表示する
    p match {
        /* matchでの方法 */
      case Some(person) =>
      {
        val newperson = person.addFriend("Windows")
        newperson.showFriend()
      }
      case None => println("")
    }
    /* foreachでの方法 */
    p.map(person => person.addFriend("Windows"))
     .foreach(person => person.showFriend())

    p.map(_.addFriend("Windows"))
     .foreach(_.showFriend())
  }
}

