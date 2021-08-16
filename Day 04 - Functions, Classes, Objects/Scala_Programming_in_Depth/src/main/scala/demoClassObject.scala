// Simple Class and Objects demo
// Method with side effect

// Access level in Scala
  // public can access anywhere (By Default),
  // private can access only in the class it is defined,
  // protected can access in class it is defined as well as in subclass extending the give class using inheritence
  // (discuss in detail when we study inheritence).

class Car {
  // Defining two variables
  var topClassExtraCost = 0
  private var roadTax = 100
//  protected var xyz = 10

  // Creating functions
  def cost (basicCost: Int): Int = basicCost + topClassExtraCost + roadTax

  def checkTax (): Int = {
    roadTax = 10
    roadTax
  }
}

//class smallCar extends Car {
//  println(roadTax)
//  println(xyz)
//

object demoClassObject {

  def main(args: Array[String]): Unit = {

    println("Hello World Scala")

    var bmw = new Car
    bmw.topClassExtraCost = 500

    println("Road Tax is " + bmw.checkTax())

    var  result = bmw.cost(10000)
    println("Total cost of car is " + result)


//    println(bmw.topClassExtraCost)
//    println(bmw.roadTax)
//    println(bmw.xyz)
//
//    bmw.roadTax = 200
//    println(bmw.roadTax)
//
//    var a = new Car
//    println(a.roadTax)
  }
}
