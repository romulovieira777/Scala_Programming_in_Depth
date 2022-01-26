object DemoAFunctions {
  def sum(x: Int, y: Int): Int = {
    var z: Int = x + y
    return z
  }
  def main(args: Array[String]): Unit ={
    var z = sum(2, 3)
    println(z)
  }
}
