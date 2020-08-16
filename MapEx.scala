package com.app.collections

object MapEx {

  val mymap: Map[Int, String] = Map(1000 -> "Bala", 1001 -> "Murugan", 1002 -> "Scala");
  val mymap2: Map[Int, String] = Map(1003->"java");

  def main(ar: Array[String]) {

    println(mymap)
    println(mymap(1002))
    println(mymap.keys)
    println(mymap.values)
    println(mymap.isEmpty)
    
    mymap.keys.foreach{
      key => println("key "+key); println("value "+mymap(key));
    }
    
    println(mymap.contains(1001))
    println(mymap ++ mymap2)
    println(mymap.++(mymap2))
    println(mymap.size)
  }
}