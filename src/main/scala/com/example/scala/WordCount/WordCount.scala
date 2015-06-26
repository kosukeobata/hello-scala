package com.example.scala.WordCount


  def countFruits(lines: List[String]): Map[String, Int] = {
    val g = lines.flatMap(x => x.split(" "))
    val a = g.foldLeft(Map.empty[String, Int]){ (key, value) =>
      val newvalue = key.getOrElse(value, 0)
      key + (value -> (1 + newvalue))
    }
    return a
  }


  def func(x: Int): Int = x + 1

  /* 渦巻きマークは再帰 */
  def f(x: Int): Int = f(x - 1) + x

  /* 矢印の円マークは末尾再帰 */
  def f2(x: Int, acc: Int = 0): Int = {
    f2(x -1 , acc + x)
  }

  def factorial(n: Int): Long = {
    @scala.annotation.tailrec
    def fac0(n: Int, acc: Int = 1): Long = {
    if (n == 0) acc
      else fac0(n - 1, n * acc)
    }
    fac0(n)
  }

  def main(args: Array[String]) {
    val fruits = List("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple")
    println(countFruits(fruits))
  }
}
