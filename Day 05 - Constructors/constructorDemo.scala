package Day_05_Constructors

// Program number 1:

class demoClass {
  val x = 3     // var <= can change to value of variable, val <= can not change
  val y = 2

  def addNumber(): Int = {
    x + y
  }

  // Two ways to get the same result
  println(s"x = ${x} and y = ${y}")
  println("x = " + x + " and y = " + y)

  val z: Int = addNumber()
  println(s"z = ${z}")
}


object constructorDemo {
  def main(args: Array[String]): Unit = {
    println("Hello World Scala!!!")

    val demoObject01 = new demoClass      // Creating a object - Instance of class - Constructor: Will execute every thing in class
  }
}
