package com.app

object Statements {
  
  def main(args:Array[String]){
    
    // var - mutable, val - immutable v
    var res=""; // mutable
    val x=21;// Assignments we use =
    
    // conditional checks we use ==
    if(x==20){ 
      res="yes x eqauls to 20";
    }else{
      res="no x not eqauls to 20";
    }
    
    println("res= ",res);
    
    val res2 = if(x==20) "x eqauls to 20" else "x not eqauls to 20";
    println("res2"+ res2);
    
    var y=0;
    while(y<10){
      println("y= "+y);
      y+=1;
      // not allowed y++
    }
    
    println("do while loop");
    
    do{
      println("y= "+y);
      y+=1;
    }while(y<10);
    
    
    println("\nfor loop using to");
    println("--------------------");
    // to is an method
    for(i <- 1 to 5){
      println("i using to "+i);
    }
    
    println("\nfor loop using until");
    println("--------------------");
    for(i <- 1.until(6)){
      println("i using until "+i);
    }
    
    println("\nnested loop");
    println("--------------------");
    for(i <- 1.to(9);j <- 1.to(3) ){
      println("i using multiple ranges "+i+" "+j);
    }
    
    
    
    
  }
  
}