package com.app

object HelloWorld {
  
  def main(args:Array[String]){
    
    println("Hello ! World ")
    
    val name="Bala"
    val age=26
    
    println(name +" age is "+age+" years old");
    println(s"$name age is $age years old");// s - interpolation method
    println(f"$name%s age is $age%d years old");// f - interpolation method
    
    println(s"Hello \nworld");// raw - interpolation method
    println(raw"Hello \nworld");// raw - interpolation method
    
    // single line comment section
    /*multiple comment section*/
  }
  
}