import scala.util.control.Breaks

object DemoCForLoop {
  def main(args: Array[String]): Unit = {
    // it will execute for i from 1 to 10
    for (i <- 1 to 10) {
      println("Value of i is " + i)
    }

    // it will execute for i from 1 until 10 / from 1 to 9
    for (i <- 1 until 10) {
      println("Value of i is using until " + i)
    }

    println("=============Nested Foor Loop=================")
    // Nested for loop
    for (i <- 1 to 10) {
      for (j <- 1 to 10) {
        println("Value of i is " + i + ". Value of j is " + j)
      }
    }

    // Nested for loop - Scala
    for (i <- 1 to 10; j <- 1 to 10; k <- 1 to 10) {
      println("Value of i is " + i + ". Value of j is " + j + ". Value of k is " + k)
    }

    // list - similar to Arrays. List is immutable. i.e. you can not change to contents of a List once is defined
    println("==================For Loop for Collections========================")
    var numbersList = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i <- numbersList) {
      println("Value of i is " + i)
    }

    // list - similar to Arrays. List is immutable. i.e. you can not change to contents of a List once is defined
    println("=============For Loop for Collections with Filter=================")
    var numbersList02 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i <- numbersList02 if i % 2 == 0; if i != 4) {
      println("Value of i is " + i)
    }

    println("=============For Loop for Collections with Filter with YIELD=================")
    var numbersList03 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var evenNumberList = for (i <- numbersList03 if i % 2 == 0) yield i
    println(evenNumberList)  // it will give even number list List(2, 4, 6, 8, 10)


    // break statement - scala 2.8
    println("=============For Loop for Collections with Filter and with BREAK=================")

    var numbersList04 = List (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val breakObject = new Breaks;

    breakObject.breakable {
      for (i <- numbersList04 if i % 2 == 0) {
        println("Value of i is " + i)

        if (i == 4) {
          println("i am breaking at 4")
          breakObject.break
        }
      }

      // infinite loop
//      var i = 5
//      while (i <  10) {
//        println("Value of i is using until " + i)
//        // you forget write i = i + 1
//      }
   }
  }
}
