// Functions with Named Arguments

def sum(x: Int, y: Int): Int = {
  println("Value of x is " + x)
  println("Value of y is " + y)
  return (x + y)
}

object DemoBFunctionWithNamedArguments {
  def main(args: Array[String]): Unit = {
    var z = sum(2, 3)
    println(z)
  }
}
