package com.example.scala.sample


class Sample {

  def plus(x: Int, y: Int): Int = {
    return x.+(y);
  }


  def minus(x: Int, y: Int): Int = {
    return x.-(y);
  }


  def before(): Unit = {
    val list = new ::(1, new ::(2, new ::(3, Nil)))

    val total = list.foldLeft(0)(new Function2[Int, Int, Int] {
      def apply(a: Int, b: Int): Int = {
        return a.+(b);
      }
    })

    val product = list.foldLeft(1)(new Function2[Int, Int, Int]{
      def apply(a: Int, b: Int): Int = {
        return a.*(b);
      }
    })

    Seq("a", "b", "c").foldLeft("")(new Function2[String, String, String]{
      def apply(a: String, b: String): String = {
        if(a.isEmpty) {
          return a.+(b);
        } else {
          return a.+(",").+(b);
        }
      }
    })

    Map("a" -> 1, "b" -> 2, "c" -> 3).map(new Function1[(String, Int), (String, Int)]{
      def apply(a: (String, Int)): (String, Int) = {
        return (a._1, a._2.+(1));
      }
    })
  }

}

