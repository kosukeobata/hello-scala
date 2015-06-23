package com.example.scala.fizzbuzz

object FizzBuzz {

  def main(args: Array[String]): Unit = {
    // ヒント
    (1 to 100).foreach { x =>
      // 剰余算
      if(x % 2 == 0) {
        "偶数です"
      } else {
        println(x)
      }
    }
  }

}
