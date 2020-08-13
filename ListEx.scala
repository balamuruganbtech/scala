package com.app

object ListEx {

  def main(args: Array[String]) {

    val list = List(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("\nActual List");
    println("--------------------");
    for (i <- list) {
      println(i)
    }

    // filter the condition
    println("\nFilter List");
    println("--------------------");
    for (i <- list; if i < 6) {
      println("i using filters "+i)
    }
    
    // if condition can be used in expression or statements
    println("\nFor loop Expression using yield keyword");
    println("--------------------");
    val result = for {i <- list; if i < 6} yield {
      i*i
    }
    println("result = "+result)
  }
}