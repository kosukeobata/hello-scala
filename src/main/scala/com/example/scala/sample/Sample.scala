package com.example.scala.sample


class Sample {

  def plus(x: Int, y: Int) = x.+(y)

  def minus(x: Int, y: Int) = x.-(y)


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


/* できる限りbeforeを省略したメソッド */
  def after(): Unit = {
    val list = List(1, 2, 3)

    val total = list.foldLeft(0)(_ + _)
//    val total = list.foldLeft(0)((a, b) => a.+(b))

    val product = list.foldLeft(1)(_ * _)
//    val product = list.foldLeft(1)((a, b) => a.*(b))

    Seq("a", "b", "c").mkString(",")
//    Seq("a", "b", "c").foldLeft("")((a, b) =>
//    if(a.isEmpty) {
//      a.+(b)
//    } else {
//      a.+(",").+(b)
//    })

    Map("a" -> 1, "b" -> 2, "c" -> 3).mapValues(_ + 1)

//    Map("a" -> 1, "b" -> 2, "c" -> 3).map(new Function1[(String, Int), (String, Int)]{
//      def apply(a: (String, Int)): (String, Int) = {
//        (a._1, a._2.+(1))
//      }
//    })
  }

}

