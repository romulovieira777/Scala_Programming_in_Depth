package Day_05_Constructors

// Program number 4: Auxiliary Constructor

class demoClass03 (val a: Int, val b: Double, val c: String) {
  val x: Int = a
  var y: Double = b
  val z: String = c

  println(s"Primary constructor says: x = ${x} and y = ${y} and z = ${z}")

  def addNumber(): Double = {
    x + y
  }

  def this() {
   this(99, 00.00, "Hello Scala")
    println("I came into Auxiliary constructor with 0 parameters")
  }

  def this(a: Int) {
    this(a, 00.00, "Hello Scala")
    println("I came into Auxiliary constructor with 1 parameters")
  }

  def this(a: Int, b: Double) {
    this(99, 00.00, "Hello Scala")
    println("I came into Auxiliary constructor with 2 parameters")
  }
}


object constructorDemo03 {
  def main(args: Array[String]): Unit = {
    val demoObject01 = new demoClass03(5, 7.2, "Hello World Scala!")
    val demoObject02 = new demoClass03()
    val demoObject03 = new demoClass03(7)
    val demoObject04 = new demoClass03(7, 2.2)
  }
}
