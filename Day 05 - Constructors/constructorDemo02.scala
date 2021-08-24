package Day_05_Constructors

// Program number 3: Default Parameters in Constructor (Primary Constructor)

class demoClass02 (val a: Int = 99, val b: Double = 00.00, val c: String = "Hello Scala" ) {
  val x: Int = a
  var y: Double = b
  val z: String = c

  def addNumber(): Double = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")

}


object constructorDemo02 {
  def main(args: Array[String]): Unit = {
    val demoObject01 = new demoClass02(5, 7.2, "Hello World Scala!")
    val demoObject02 = new demoClass02()
    val demoObject03 = new demoClass02(25)
//    val demoObject04 = new demoClass02("Hello World") - You need to pass parameter in correct sequence, for out of sequence see next example
    val demoObject05 = new demoClass02(c = "Hello World")
    val demoObject06 = new demoClass02(c = "Hello World", a = 5, b = 6.6)
//    val demoObject07 = new demoClass02( , , "Hello") - can not do
//    val demoObject08 = new demoClass02(a, b, "Hello World") - can not do, it does not know what is a and b simply, can be done as below
    val demoObject09 = new demoClass02(a = 5, b = 5.5, "Hello World")
  }
}
