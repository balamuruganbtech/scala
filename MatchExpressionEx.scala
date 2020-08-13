package com.app

object MatchExpressionEx {
  
  def main(args: Array[String]) {
    
    val age=25;
    
    age match{
      
      case 20 =>println(age);
      case 18 =>println(age);
      case _ => println("default");
    }
    
    var result =  age match{
      case 20 =>age;
      case 18 =>age;
      case 25 =>age;
      case _ => "default";
    }
    
    println("result= "+result);
    
    val i=7;
    i match{
      case 1 | 3 | 5 | 7 | 9 => println("odd"); 
      case 2 | 4 | 6 | 8 | 10 => println("odd"); 
    }
  }
}