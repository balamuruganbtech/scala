package com.app.collections

// tuple - tuple can store max 22 elements
object TuplesEx {

  val mytuple1 = (1, 2, "hello", true);
  val mytuple2 = new Tuple3(1, 2, "hello");
  val mytuple3 = new Tuple2(1, "hello");

  def main(args: Array[String]) {

    println(mytuple1)
    println(mytuple2)
    println(mytuple3)

    println("----- Fetch Each Element --------")
    println(mytuple1._1)
    println(mytuple1._2)
    println(mytuple1._3)
    println(mytuple1._4)

    println("----- Product Iterator --------")
    mytuple1.productIterator.foreach {
      i => println(i);
    }
    
     println(1->"hello"->true)
  }
}