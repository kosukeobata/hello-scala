package com.example.scala.fizzbuzz

object FizzBuzz {

  def toStr(x: Int): String = x match {
    case x if x % 15 == 0 => "ウェイウェーイ"
    case x if x % 3 == 0  => "ウェイ"
    case x if x % 5 == 0  => "ウェーイ"
    case _                => x.toString
  }

  def fizzbuzz1() = {
    (1 to 100).map(toStr).foreach(println)
  }

  def fizzbuzz2() = {
    (1 to 100).filter(x => x % 2 != 0).map(toStr).foreach(println)
  }

  /* mkString()でListの間にStringを挿入することができる。 */
  def fizzbuzz3() = {
    println((1 to 100).filter(x => x % 2 != 0).map(toStr).mkString(", "))
  }

  def fizzbuzz4() = {
    println((1 to 100).filter(x => (x % 2 != 0) && (x % 3 != 0) && (x % 5 != 0)).sum)
  }

  /* 再帰処理を行う。 */
  def fizzbuzz5(start: Int, end: Int): Unit = {
    println(toStr(start))
    if (start < end) fizzbuzz5(start + 1, end)
  }

  def main(args: Array[String]): Unit = {
    fizzbuzz3()
  }
}
