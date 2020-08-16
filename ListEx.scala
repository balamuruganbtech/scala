package com.app.collections

// list - immutable
// we can't able to change - in array it's possible
// :: - cons
object ListEx {

  def main(args: Array[String]) {

    val list = List(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val mylist: List[Int] = List(1, 2, 5, 8, 6, 9, 4);
    val names: List[String] = List("Bala", "Murgan", "Scala", "Spark");

    println("\nActual List");
    println("--------------------");
    for (i <- list) {
      println(i)
    }

    // filter the condition
    println("\nFilter List");
    println("--------------------");
    for (i <- list; if i < 6) {
      println("i using filters " + i)
    }

    // if condition can be used in expression or statements
    println("\nFor loop Expression using yield keyword");
    println("--------------------");
    val result = for { i <- list; if i < 6 } yield {
      i * i
    }
    println("result = " + result)

    println("-----------------CONS Example-----------------------")
    println(0 :: mylist)
    println(1 :: 5 :: 10 :: Nil)
    println("-----------------head/tail/isEmpty Example-----------------------")
    println(mylist.head)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(mylist.reverse)
    println(mylist.reverse)
    println(mylist.max)

    println(List.fill(5)(2))

    mylist.foreach(println)
    var sum: Int = 0;
    mylist.foreach(sum += _)
    println(sum);

    for (name <- names) {
      println(name)
    }
    
    println(names(0))

  }
}