// Value Class: Can not allocate runtime object
// Value class always has ONLY 1 PARAMETER WITH TYPE AS VAL
// You can not extend a Value Class.

//Benefits of Value Class
// 1. Less initialization
// 2. Better performance
// 3. Less Memory usage

// Use Case: Performance and Memory Optimization.

// VALUE CLASS CAN NOT EXTEND A TRAIT. THATS WHY YOU HAVE A UNIVERSAL TRAITS

trait CarE extends Any{
  def print(){println(this)}
}

class MercedesE(val x:Int) extends AnyVal with CarE{
  // var y = 1 ---> Can not define any variables in a value class. Can only define methods

  def hello: Unit ={
    println("Hello")
  }
}


object DemoETrait {
  def main(args: Array[String]): Unit = {
    val m1 = new MercedesE(5)
    m1.print()
    m1.hello
  }

}
