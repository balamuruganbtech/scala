package com.app

object HigherOrderFunction {
  
  def Math(x:Double, y:Double, f:(Double, Double)=>Double):Double=f(x,y);
  def Math(x:Double, y:Double, z:Double, f:(Double, Double)=>Double):Double=f(f(x,y),z);
  
  def main(ar:Array[String]){
    
    var add = Math(50,20,(x,y)=>x+y);
    var sub = Math(50,20,(x,y)=>x-y);
    var mul = Math(50,20,(x,y)=>x*y);
    var div = Math(50,20,(x,y)=>x/y);
    var min = Math(50,20,(x,y)=>x min y);
    var max = Math(50,20,(x,y)=>x max y);
    
    var add_3 = Math(50,20,70,(x,y)=>x+y);
    var sub_3 = Math(50,20,70,(x,y)=>x-y);
    var min_3 = Math(50,20,70,(x,y)=>x min y);
    
    println("add= "+add);
    println("add_3= "+add_3);
    println("sub= "+sub);
    println("sub_3= "+sub_3);
    println("mul= "+mul);
    println("div= "+div);
    println("min= "+min);
    println("min_3= "+min_3);
    println("max= "+max);
  }
}