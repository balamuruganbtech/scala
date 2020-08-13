package com.app

object AnnonymousFn {

  object Math {
    
    def +(x: Int = 45, y: Int = 35):Int={
      return x+y;
    }
    
    def **(x: Int) = x * x;
    
    def add(x: Int = 45, y: Int = 35): Int = {
      return x + y;
    }

    def square(x: Int) = x * x;
  }
  
  def print(x: Int, y: Int):Unit={
    println(x+y)
  }

  def main(args: Array[String]) {

    println(Math square 3)
    
    println("Math + operation "+Math.+(5,5))
    println("Math ** operation ",Math.**(5))
    
    println(Math.add(5,5))
    println(Math.add(5))
    println(Math.add())
    
    println(AnnonymousFn.print(10, 10))
    
    
  }
}