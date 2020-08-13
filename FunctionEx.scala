package com.app

object FunctionEx {
  
  object Math{
       
        def add(x: Int, y: Int): Int = {
          return x + y;
        }
        
        def square(x:Int)=x*x;
  }

  def add(x: Int, y: Int): Int = {
    return x + y;
  }

  def sub(x: Int, y: Int): Int = {
    return x - y;
  }

  def mul(x: Int, y: Int): Int = x * y;

  def div(x: Int, y: Int): Int = x / y;

  def main(arg: Array[String]) {

	  println("Math object-add "+Math.add(45, 15))
	  println("Math object-square "+Math.square(4))
    println(add(45, 15))
    println(sub(45, 15))
    println(mul(45, 15))
    println(div(45, 15))
  }

}