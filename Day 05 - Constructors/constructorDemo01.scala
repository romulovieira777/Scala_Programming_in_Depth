package Day_05_Constructors

// Program number 2: Parametrized Constructor (Primary constructor)

class demoClass01 (val a: Int, val b: Double, val c: String ) {
  val x: Int = a              // var (Can change the value) and val (can not change the value);
  var y: Double = b           // retrieve(GET) and change(SET) the content of y because it is a var >>> INTERNALLY SCALA CREATES 2 METHODS - GETTER AND SETTER
  val z: String = c           // ONLY retrieve the(GET) content of y because it is a val >>> INTERNALLY SCALA CREATES ONLY 1 METHOD - GETTER

  def addNumber(): Double = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")

}


object constructorDemo01 {
  def main(args: Array[String]): Unit = {
    val demoObject01 = new demoClass01(5, 7.2, "Hello World Scala!")  // Object - Instance of class -> Calls Constructor
    val demoObject02 = new demoClass01(6, 8.3, "Hello World")

//    demoObject01.x = 3 -> Can not change(only retrieve) the content of x as it was defined as val in the class and hence it only has getter method
    demoObject01.y = 7.22222  // Can retrieve change the content of y ait was defined as var in the class and hence it has getter and setter methods

    print(demoObject01.x, demoObject01.y, demoObject01.z)
    var result = demoObject01.addNumber()
    println(s"Result = ${result}")

    println(demoObject02.x, demoObject02.y, demoObject02.z)
    result = demoObject02.addNumber()
    println(s"Result = ${result}")
  }
}
