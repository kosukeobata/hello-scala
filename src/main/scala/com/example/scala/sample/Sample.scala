package com.example.scala.sample

class Sample {

  def plus(x: Int, y: Int): Int = {
    return x + y
  }

  def minus(x: Int, y: Int) = x - y


  def concatAsString(x: Int, y: Int): String = {
    val a = x.toString();
    val b = y.toString();
    return a.+(b);
  }


  def concatList(l1: List[Int], l2: List[Int]): List[Int] = {

    val f: Function2[Int, List[Int], List[Int]] = new Function2[Int, List[Int], List[Int]] {
      def apply(x: Int, y: List[Int]): List[Int] = {
        y.::(x)
      }
    }

    f.apply(1, l1)
    f(1, l1)

    l1.foldRight(l2)(f)

    l1.foldRight(l2)(new Function2[Int, List[Int], List[Int]] {
      def apply(x: Int, y: List[Int]): List[Int] = {
        y.::(x)
      }
    })

    l1.foldRight(l2)(f)
  }


  def before() = {
    val plus: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
      def apply(x: Int, y: Int): Int = {
        return x.+(y);
      }
    };

    val list = new ::(1, new ::(2, new ::(3, Nil)));

    val sum = list.foldLeft(0)(plus);

    println(sum);

    val list2 = list.::(4)

    list2.filter(new Function1[Int, Boolean] {
      def apply(x: Int): Boolean = {
        return x % 2 == 0;
      }
    });


  }

}

