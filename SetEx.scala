package com.app.collections

// list - immutable
// we can't able to change - in array it's possible
// :: - cons
object SetEx {

  def main(args: Array[String]) {

    val set = scala.collection.mutable.Set(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val myset: Set[Int] = Set(11, 12, 5, 8, 13, 15, 14);
    val names: Set[String] = Set("Bala", "Murgan", "Scala", "Spark");

    println("\nActual set");
    println("--------------------");
    for (i <- set) {
      println(i)
    }
    println("\nSet");
    println("--------------------");
    println(set + 20)
    println(set(5))
    println(set(55))

    println("\nSet operations head/tail/isEmpty/Max");
    println("--------------------");
    println(set)
    println(set.head)
    println(set.tail)
    println(set.isEmpty)
    println(set.max)

    println("\nSet operations Concatenation");
    println("--------------------");
    println(set ++ myset)
    println(set.++(myset))

    println("\n Intersection");
    println("--------------------");
    println(set.&(myset))
    println(set.intersect(myset))

    println(set.max)
    println(set.min)

    set.foreach(println)

    for (name <- names) {
      println(name)
    }

  }
}