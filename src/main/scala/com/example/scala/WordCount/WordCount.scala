package com.example.scala.WordCount

object WordCount {

//  def countFruits(lines: List[String]): Map[String, Int] = {
//    Map("", 5)
//  }

  def main(args: Array[String]) {
    val fruits = List("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple")
    val g = fruits.map(x => x.split(" ")).flatten
    println(g.distinct)
    println(g)
    val a = g.foldLeft(Map.empty[String, Int]){ (fruitmap, fruit) =>
      fruitmap + (fruit -> {
        1
//        + (for((key, value) <- fruitmap) if (key == fruit) 1 else 0)
      })
    }
    println(a)
    a.map(x => println(x))
    for ((key, value) <- a) if (key == Nil) 1 else 0
        a.foreach { kv =>
          val (key, value) = kv
          println(s"key:$key, value:$value")
          println("key: " + key + ", value: " + value)
        }
  }
}
