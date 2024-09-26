// Even Number or Odd number
// print Evfent or print Odd

object DemoUClosures {

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(2))
    println(evenOrOdd(3))
    println(evenOrOdd(4))
    println(evenOrOdd(5))
    println(evenOrOdd(6))
  }

  def evenOrOdd(x: Int): String = {
    var evenFlag = isEven(x)
    if (evenFlag) {
      "Even Number"
    } else {
      "Odd Number"
    }
  }

  //def isEven (x: Int): Boolean = {  // Traditional Function Definition
  //  x % 2 == 0
  //}
  var div = 2
  var isEven = (x: Int) => x % div == 0
  //val isEven: Int => Boolean = (x) => { // If you want to specify retiurn type
  //  x % 2 == 0
  //}
}
